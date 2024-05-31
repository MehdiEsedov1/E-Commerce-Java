package com.example.ecommerce2.model.dto.request;

import com.example.ecommerce2.model.entity.Product;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartRequest {
    int count;
    int total_amount;
    @OneToMany
    List<Product> productList;
}
