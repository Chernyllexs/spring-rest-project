package com.chernyllexs.shop.models;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.entity.CustomerEntity;
import com.chernyllexs.shop.entity.ShopEntity;

import java.util.Date;

public class PurchasesDto {
    private Long purchaseId;
    private Date orderDate;
    private ShopEntity orderSeller;
    private CustomerEntity orderCustomerEntity;
    private BookEntity orderBook;
    private Integer orderQuantity;
    private Float orderAmount;

    public PurchasesDto() {
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ShopEntity getOrderSeller() {
        return orderSeller;
    }

    public void setOrderSeller(ShopEntity orderSeller) {
        this.orderSeller = orderSeller;
    }

    public CustomerEntity getOrderCustomerEntity() {
        return orderCustomerEntity;
    }

    public void setOrderCustomerEntity(CustomerEntity orderCustomerEntity) {
        this.orderCustomerEntity = orderCustomerEntity;
    }

    public BookEntity getOrderBook() {
        return orderBook;
    }

    public void setOrderBook(BookEntity orderBook) {
        this.orderBook = orderBook;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurchasesDto that = (PurchasesDto) o;

        if (getPurchaseId() != null ? !getPurchaseId().equals(that.getPurchaseId()) : that.getPurchaseId() != null)
            return false;
        if (getOrderDate() != null ? !getOrderDate().equals(that.getOrderDate()) : that.getOrderDate() != null)
            return false;
        if (getOrderSeller() != null ? !getOrderSeller().equals(that.getOrderSeller()) : that.getOrderSeller() != null)
            return false;
        if (getOrderCustomerEntity() != null ? !getOrderCustomerEntity().equals(that.getOrderCustomerEntity()) : that.getOrderCustomerEntity() != null)
            return false;
        if (getOrderBook() != null ? !getOrderBook().equals(that.getOrderBook()) : that.getOrderBook() != null)
            return false;
        if (getOrderQuantity() != null ? !getOrderQuantity().equals(that.getOrderQuantity()) : that.getOrderQuantity() != null)
            return false;
        return getOrderAmount() != null ? getOrderAmount().equals(that.getOrderAmount()) : that.getOrderAmount() == null;
    }

    @Override
    public int hashCode() {
        int result = getPurchaseId() != null ? getPurchaseId().hashCode() : 0;
        result = 31 * result + (getOrderDate() != null ? getOrderDate().hashCode() : 0);
        result = 31 * result + (getOrderSeller() != null ? getOrderSeller().hashCode() : 0);
        result = 31 * result + (getOrderCustomerEntity() != null ? getOrderCustomerEntity().hashCode() : 0);
        result = 31 * result + (getOrderBook() != null ? getOrderBook().hashCode() : 0);
        result = 31 * result + (getOrderQuantity() != null ? getOrderQuantity().hashCode() : 0);
        result = 31 * result + (getOrderAmount() != null ? getOrderAmount().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PurchasesDto{" +
                "purchaseId=" + purchaseId +
                ", orderDate=" + orderDate +
                ", orderSeller=" + orderSeller +
                ", orderCustomerEntity=" + orderCustomerEntity +
                ", orderBook=" + orderBook +
                ", orderQuantity=" + orderQuantity +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
