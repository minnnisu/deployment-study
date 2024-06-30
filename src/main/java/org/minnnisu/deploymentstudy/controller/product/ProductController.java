package org.minnnisu.deploymentstudy.controller.product;

import lombok.RequiredArgsConstructor;
import org.minnnisu.deploymentstudy.dto.*;
import org.minnnisu.deploymentstudy.entity.Product;
import org.minnnisu.deploymentstudy.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public ProductSaveResponseDto saveProduct(@RequestBody ProductSaveRequestDto productSaveRequestDto) {
        return productService.saveProduct(productSaveRequestDto);
    }

    @PutMapping("/{id}")
    public ProductUpdateResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductUpdateRequestDto productUpdateRequestDto) {
        return productService.updateProduct(id, productUpdateRequestDto);
    }

    @DeleteMapping("/{id}")
    public ProductDeleteResponseDto deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }
}