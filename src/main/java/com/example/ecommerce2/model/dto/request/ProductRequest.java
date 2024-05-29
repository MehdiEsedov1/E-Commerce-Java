package com.example.ecommerce2.model.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Size(min = 5, max = 10, message = "Name is out of range!")
    String name;
    @Min(value = 10, message = "Description must contain min 10 symbol")
    @Max(value = 30, message = "Description must contain max 30 symbol")
    String description;
    @Range(min = 50, max = 250, message = "Amount of product is out of range!")
    int amount;
    int remainCount;
    @NotNull(message = "Product details can't be null")
    @NotBlank(message = "Product details can't be blank")
    String productDetails;
}