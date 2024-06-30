package org.minnnisu.deploymentstudy.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.minnnisu.deploymentstudy.dto.*;
import org.minnnisu.deploymentstudy.entity.Product;
import org.minnnisu.deploymentstudy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductSaveResponseDto saveProduct(ProductSaveRequestDto productSaveRequestDto) {
        Product product = productRepository.save(Product.of(productSaveRequestDto.getName(), productSaveRequestDto.getPrice()));
        return ProductSaveResponseDto.fromEntity(product);
    }

    public ProductUpdateResponseDto updateProduct(Long productId, ProductUpdateRequestDto productUpdateRequestDto) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("존재하지 않은 상품입니다."));
        product.update(productUpdateRequestDto.getName(), productUpdateRequestDto.getPrice());
        return ProductUpdateResponseDto.fromEntity(product);
    }

    public ProductDeleteResponseDto deleteProduct(Long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("존재하지 않은 상품입니다."));
        ProductDeleteResponseDto productDeleteResponseDto = ProductDeleteResponseDto.fromEntity(product);
        productRepository.deleteById(productId);
        return productDeleteResponseDto;
    }
}
