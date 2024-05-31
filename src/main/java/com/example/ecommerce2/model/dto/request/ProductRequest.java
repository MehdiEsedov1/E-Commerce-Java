package com.example.ecommerce2.model.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {
    @Size(min = 5, max = 10, message = "Name is out of range!")
    String name;
    @Min(value = 10, message = "must contain min 10 symbol")
    @Max(value = 30, message = "must contain max 30 symbol")
    String description;
    @Range(min = 50, max = 250, message = "Amount of product is out of range!")
    int amount;
    int remainCount;
    @NotNull(message = "Product details can't be null")
    @NotBlank(message = "Product details can't be blank")
    String productDetails;
}