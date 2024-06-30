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
public class ProductUpdateResponseDto {
    private Long id;
    private String name;
    private int price;

    public static ProductUpdateResponseDto fromEntity(Product product){
        return ProductUpdateResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
