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
public class ProductDeleteResponseDto {
    private Long id;
    private String name;
    private int price;

    public static ProductDeleteResponseDto fromEntity(Product product){
        return ProductDeleteResponseDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
