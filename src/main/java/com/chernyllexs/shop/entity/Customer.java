package com.chernyllexs.shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;
    private String customerSurname;
    private String customerDistrict;
    private Float customerDiscount;

    protected Customer() {
    }

    public Customer(Long customerId, String customerSurname, String customerDistrict, Float customerDiscount) {
        this.customerId = customerId;
        this.customerSurname = customerSurname;
        this.customerDistrict = customerDistrict;
        this.customerDiscount = customerDiscount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerDistrict() {
        return customerDistrict;
    }

    public void setCustomerDistrict(String customerDistrict) {
        this.customerDistrict = customerDistrict;
    }

    public Float getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(Float customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerDistrict='" + customerDistrict + '\'' +
                ", customerSale=" + customerDiscount +
                '}';
    }
}
