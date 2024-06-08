package com.example.productrevision.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductResponseDto {
    private Long id;
    private String title;
    private int price;
    private String category;
    private String description;
    private String image;
}