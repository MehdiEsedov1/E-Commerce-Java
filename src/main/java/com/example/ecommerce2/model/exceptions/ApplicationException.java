package com.example.ecommerce2.model.exceptions;

import com.example.ecommerce2.model.enums.Exceptions;
import lombok.Data;
@Data
public class ApplicationException extends RuntimeException {
    private final Exceptions e;

    public ApplicationException(Exceptions e) {
        super(e.getMessage());
        this.e = e;
    }
}
