package com.chernyllexs.shop.utill.exception;

public class PurchasesNotFoundException extends RuntimeException{
    public PurchasesNotFoundException(String message) {
        super(message);
    }

    public PurchasesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
