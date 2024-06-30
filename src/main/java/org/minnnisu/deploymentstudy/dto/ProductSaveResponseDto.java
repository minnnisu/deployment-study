package org.minnnisu.deploymentstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.minnnisu.deploymentstudy.entity.Product;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProductSaveResponseDto {
    private Long id;
    private String name;
    private int price;

    public static ProductSaveResponseDto fromEntity(Product product){
        return ProductSaveResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
