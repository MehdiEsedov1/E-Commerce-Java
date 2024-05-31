package com.example.ecommerce2.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {
    String name;
    String surname;
    String email;
    String address;
    Date birthDate;
}