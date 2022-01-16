package com.chernyllexs.shop.models;

public class CustomerNameAndDiscountDto {
    private String name;
    private Float discount;

    public CustomerNameAndDiscountDto() {
    }

    public CustomerNameAndDiscountDto(String name, Float discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerNameAndDiscountDto that = (CustomerNameAndDiscountDto) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getDiscount() != null ? getDiscount().equals(that.getDiscount()) : that.getDiscount() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDiscount() != null ? getDiscount().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerNameAndDiscountDto{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
}
