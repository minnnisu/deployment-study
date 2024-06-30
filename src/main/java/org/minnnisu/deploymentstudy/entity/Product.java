package org.minnnisu.deploymentstudy.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Table
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;

    public static Product of(String name, int price){
        return Product.builder()
                .name(name)
                .price(price)
                .build();
    }

    public void update(String name, int price) {
        this.name = name;
        this.price = price;
    }
}