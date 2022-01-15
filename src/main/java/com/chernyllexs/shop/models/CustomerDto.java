package com.chernyllexs.shop.models;

public class CustomerDto {
    private Long customerId;
    private String customerSurname;
    private String customerDistrict;
    private Float customerDiscount;

    public CustomerDto() {

    }

    public CustomerDto(Long customerId, String customerSurname, String customerDistrict, Float customerDiscount) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerDto that = (CustomerDto) o;

        if (getCustomerId() != null ? !getCustomerId().equals(that.getCustomerId()) : that.getCustomerId() != null)
            return false;
        if (getCustomerSurname() != null ? !getCustomerSurname().equals(that.getCustomerSurname()) : that.getCustomerSurname() != null)
            return false;
        if (getCustomerDistrict() != null ? !getCustomerDistrict().equals(that.getCustomerDistrict()) : that.getCustomerDistrict() != null)
            return false;
        return getCustomerDiscount() != null ? getCustomerDiscount().equals(that.getCustomerDiscount()) : that.getCustomerDiscount() == null;
    }

    @Override
    public int hashCode() {
        int result = getCustomerId() != null ? getCustomerId().hashCode() : 0;
        result = 31 * result + (getCustomerSurname() != null ? getCustomerSurname().hashCode() : 0);
        result = 31 * result + (getCustomerDistrict() != null ? getCustomerDistrict().hashCode() : 0);
        result = 31 * result + (getCustomerDiscount() != null ? getCustomerDiscount().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerId=" + customerId +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerDistrict='" + customerDistrict + '\'' +
                ", customerDiscount=" + customerDiscount +
                '}';
    }
}
