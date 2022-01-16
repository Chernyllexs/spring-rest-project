package com.chernyllexs.shop.controllers;

import com.chernyllexs.shop.models.CustomerDto;
import com.chernyllexs.shop.models.CustomerNameAndDiscountDto;
import com.chernyllexs.shop.services.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomerById(id);
    }

    @PatchMapping("/{id}")
    public void updateCustomer(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
        customerService.updateCustomerById(id, customerDto);
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody CustomerDto customerDto) {
        customerService.addCustomer(customerDto);
    }

    @GetMapping
    public List<CustomerDto> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDto getCustomer(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public void rewriteCustomer(@PathVariable Long id, @RequestBody CustomerDto customerDto) {
        customerService.rewriteCustomer(id, customerDto);
    }

    @GetMapping("/different-customer-districts")
    List<String> getDifferentCustomerDistricts(){
        return customerService.getDifferentCustomerDistricts();
    }

    @GetMapping("/name-and-discount-customers-from-Nizhegorodsky")
    List<CustomerNameAndDiscountDto> findCustomersByDistrict(){
        return customerService.findCustomersByDistrict("Nizhegorodsky");
    }

}
