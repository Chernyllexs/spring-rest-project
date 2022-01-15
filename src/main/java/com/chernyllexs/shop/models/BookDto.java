package com.chernyllexs.shop.models;

public class BookDto {
    private  Long bookId;
    private  String bookName;
    private  Float bookPrice;
    private  String bookWarehouse;
    private  Integer bookQuantity;


    public BookDto() {
    }

    public BookDto(Long bookId, String bookName, Float bookPrice, String bookWarehouse, Integer bookQuantity) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookDto bookDto = (BookDto) o;

        if (getBookId() != null ? !getBookId().equals(bookDto.getBookId()) : bookDto.getBookId() != null) return false;
        if (!getBookName().equals(bookDto.getBookName())) return false;
        return getBookPrice().equals(bookDto.getBookPrice());
    }

    @Override
    public int hashCode() {
        int result = getBookId() != null ? getBookId().hashCode() : 0;
        result = 31 * result + getBookName().hashCode();
        result = 31 * result + getBookPrice().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookWarehouse='" + bookWarehouse + '\'' +
                ", bookQuantity=" + bookQuantity +
                '}';
    }

}
