package com.chernyllexs.shop.services;

import com.chernyllexs.shop.models.CustomerDto;
import com.chernyllexs.shop.models.CustomerNameAndDiscountDto;

import java.util.List;

public interface CustomerService {
    void deleteCustomerById(Long id);

    void updateCustomerById(Long id, CustomerDto updatedCustomerDto);

    void addCustomer(CustomerDto newCustomerDto);

    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomerById(Long id);

    void rewriteCustomer(Long id, CustomerDto newCustomerDto);

    List<String> getDifferentCustomerDistricts();

    List<CustomerNameAndDiscountDto> findCustomersByDistrict(String district);
}
