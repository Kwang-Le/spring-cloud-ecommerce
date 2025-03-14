package com.test.customer.exceptions.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException{
    private String status;
    private String code;
    private String message;

    public BaseException(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public BaseException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseException(String message) {
        this.message = message;
    }
}
