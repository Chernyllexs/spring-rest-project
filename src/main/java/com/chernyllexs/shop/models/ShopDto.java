package com.chernyllexs.shop.models;

public class ShopDto {
    private Long shopId;
    private String shopName;
    private String shopDistrict;
    private Float shopDiscount;

    public ShopDto() {
    }

    public ShopDto(Long shopId, String shopName, String shopDistrict, Float shopDiscount) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopDto shopDto = (ShopDto) o;

        if (getShopId() != null ? !getShopId().equals(shopDto.getShopId()) : shopDto.getShopId() != null) return false;
        if (getShopName() != null ? !getShopName().equals(shopDto.getShopName()) : shopDto.getShopName() != null)
            return false;
        if (getShopDistrict() != null ? !getShopDistrict().equals(shopDto.getShopDistrict()) : shopDto.getShopDistrict() != null)
            return false;
        return getShopDiscount() != null ? getShopDiscount().equals(shopDto.getShopDiscount()) : shopDto.getShopDiscount() == null;
    }

    @Override
    public int hashCode() {
        int result = getShopId() != null ? getShopId().hashCode() : 0;
        result = 31 * result + (getShopName() != null ? getShopName().hashCode() : 0);
        result = 31 * result + (getShopDistrict() != null ? getShopDistrict().hashCode() : 0);
        result = 31 * result + (getShopDiscount() != null ? getShopDiscount().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShopDto{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopDistrict='" + shopDistrict + '\'' +
                ", shopDiscount=" + shopDiscount +
                '}';
    }
}
