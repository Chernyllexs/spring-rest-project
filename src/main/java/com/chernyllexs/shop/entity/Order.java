package com.chernyllexs.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private Date orderDate;
    private Shop orderSeller;
    private Customer orderCustomer;
    private Book orderBook;
    private Integer orderQuantity;
    private Float orderAmount;

    protected Order() {
    }

    public Order(Long orderId, Date orderDate, Shop orderSeller, Customer orderCustomer, Book orderBook, Integer orderQuantity, Float orderAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderSeller = orderSeller;
        this.orderCustomer = orderCustomer;
        this.orderBook = orderBook;
        this.orderQuantity = orderQuantity;
        this.orderAmount = orderAmount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public Book getOrderBook() {
        return orderBook;
    }

    public void setOrderBook(Book orderBook) {
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
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderSeller=" + orderSeller +
                ", orderCustomer=" + orderCustomer +
                ", orderBook=" + orderBook +
                ", orderQuantity=" + orderQuantity +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
