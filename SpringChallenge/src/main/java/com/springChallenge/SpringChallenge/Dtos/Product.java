package com.springChallenge.SpringChallenge.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int product_id;
    private String productName;
    private String type;
    private String brand;
    private String color;
    private String notes;
}