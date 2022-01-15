package com.chernyllexs.shop.utill.exception;

public class ShopNotFoundException extends RuntimeException{
    public ShopNotFoundException(String message) {
        super(message);
    }

    public ShopNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
