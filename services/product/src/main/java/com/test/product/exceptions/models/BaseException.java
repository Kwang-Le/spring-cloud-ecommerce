package com.test.product.exceptions.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException {
    private ErrorMessage errorMessage;

    public BaseException(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
}
