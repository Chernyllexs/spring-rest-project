package com.chernyllexs.shop.models;

public class ShopNameDto {
    private String name;

    public ShopNameDto() {
    }

    public ShopNameDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopNameDto that = (ShopNameDto) o;

        return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ShopNameDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
