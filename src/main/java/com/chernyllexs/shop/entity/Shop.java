package com.chernyllexs.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shopId;
    private String shopName;
    private String shopDistrict;
    private Float shopDiscount;

    protected Shop() {
    }

    public Shop(Long shopId, String shopName, String shopDistrict, Float shopDiscount) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopDistrict = shopDistrict;
        this.shopDiscount = shopDiscount;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDistrict() {
        return shopDistrict;
    }

    public void setShopDistrict(String shopDistrict) {
        this.shopDistrict = shopDistrict;
    }

    public Float getShopDiscount() {
        return shopDiscount;
    }

    public void setShopDiscount(Float shopDiscount) {
        this.shopDiscount = shopDiscount;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopDistrict='" + shopDistrict + '\'' +
                ", shopDiscount=" + shopDiscount +
                '}';
    }
}
