package com.chernyllexs.shop.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PURCHASES")
public class Purchases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private Long purchaseId;

    @CreationTimestamp
    private Date orderDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop orderSeller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerEntity orderCustomerEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private BookEntity orderBook;

    private Integer orderQuantity;

    private Float orderAmount;

    protected Purchases() {
    }

    public Purchases(Long purchaseId, Date orderDate, Shop orderSeller, CustomerEntity orderCustomerEntity, BookEntity orderBook, Integer orderQuantity, Float orderAmount) {
        this.purchaseId = purchaseId;
        this.orderDate = orderDate;
        this.orderSeller = orderSeller;
        this.orderCustomerEntity = orderCustomerEntity;
        this.orderBook = orderBook;
        this.orderQuantity = orderQuantity;
        this.orderAmount = orderAmount;
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

    public Shop getOrderSeller() {
        return orderSeller;
    }

    public void setOrderSeller(Shop orderSeller) {
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
    public String toString() {
        return "Order{" +
                "orderId=" + purchaseId +
                ", orderDate=" + orderDate +
                ", orderSeller=" + orderSeller +
                ", orderCustomer=" + orderCustomerEntity +
                ", orderBook=" + orderBook +
                ", orderQuantity=" + orderQuantity +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
