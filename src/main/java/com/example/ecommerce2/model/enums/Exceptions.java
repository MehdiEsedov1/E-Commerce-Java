package com.example.ecommerce2.model.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum Exceptions {

    CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND, "Category not found!"),

    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "Product not found!"),

    BRAND_NOT_FOUND(HttpStatus.NOT_FOUND, "Brand not found!");

    private final String message;
    private final HttpStatus status;

    Exceptions(HttpStatus status, String message) {
        this.message = message;
        this.status = status;
    }
}
