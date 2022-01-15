package com.chernyllexs.shop.models;

public class Book {
    private  Long bookId;
    private  String bookName;
    private  Float bookPrice;
    private  String bookWarehouse;
    private  Integer bookQuantity;


    public Book() {
    }

    public Book(Long bookId, String bookName, Float bookPrice, String bookWarehouse, Integer bookQuantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookWarehouse = bookWarehouse;
        this.bookQuantity = bookQuantity;
    }

    public Long getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public String getBookWarehouse() {
        return bookWarehouse;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }
}
