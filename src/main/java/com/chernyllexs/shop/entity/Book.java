package com.chernyllexs.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;
    private String bookName;
    private Float bookPrice;
    private String bookWarehouse;
    private Integer bookQuantity;

    protected Book() {
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

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookWarehouse() {
        return bookWarehouse;
    }

    public void setBookWarehouse(String bookWarehouse) {
        this.bookWarehouse = bookWarehouse;
    }

    public Integer getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(Integer bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookWarehouse='" + bookWarehouse + '\'' +
                ", bookQuantity=" + bookQuantity +
                '}';
    }
}
