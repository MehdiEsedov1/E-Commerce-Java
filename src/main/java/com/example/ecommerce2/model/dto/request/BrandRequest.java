package com.example.ecommerce2.model.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrandRequest {
    @Size(min = 5, max = 10, message = "Name is out of range!")
    String name;
//    @Min(value = 10, message = "must contain min 10 symbol")
//    @Max(value = 30, message = "must contain max 30 symbol")
    String description;
}