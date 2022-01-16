package com.chernyllexs.shop.services;

import com.chernyllexs.shop.entity.CustomerEntity;
import com.chernyllexs.shop.models.CustomerDto;
import com.chernyllexs.shop.models.CustomerNameAndDiscountDto;
import com.chernyllexs.shop.repository.CustomerRepository;
import com.chernyllexs.shop.utill.exception.CustomerNotFoundException;
import com.chernyllexs.shop.utill.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void updateCustomerById(Long id, CustomerDto updatedCustomerDto) {
        CustomerDto customerById = getCustomerById(id);
        if (updatedCustomerDto.getCustomerId() != null)
            customerById.setCustomerId(updatedCustomerDto.getCustomerId());
        if (updatedCustomerDto.getCustomerSurname() != null && updatedCustomerDto.getCustomerSurname().isEmpty())
            customerById.setCustomerSurname(updatedCustomerDto.getCustomerSurname());
        if (updatedCustomerDto.getCustomerDiscount() != null)
            customerById.setCustomerDiscount(updatedCustomerDto.getCustomerDiscount());
        if (updatedCustomerDto.getCustomerDistrict() != null && !updatedCustomerDto.getCustomerDistrict().isEmpty())
            customerById.setCustomerDistrict(updatedCustomerDto.getCustomerDistrict());
        customerRepository.save(customerMapper.convertToEntity(customerById));
    }

    @Override
    public void addCustomer(CustomerDto newCustomerDto) {
        customerRepository.save(customerMapper.convertToEntity(newCustomerDto));
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        Iterable<CustomerEntity> iterable = customerRepository.findAll();
        ArrayList<CustomerDto> customersDto = new ArrayList<>();
        for (CustomerEntity customerEntity : iterable) {
            customersDto.add(customerMapper.convertToDto(customerEntity));
        }
        return customersDto;
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        CustomerEntity customerEntity = customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found: id = " + id));
        return customerMapper.convertToDto(customerEntity);
    }

    @Override
    public void rewriteCustomer(Long id, CustomerDto newCustomerDto) {
        CustomerDto customerById = getCustomerById(id);
        customerById.setCustomerId(newCustomerDto.getCustomerId());
        customerById.setCustomerSurname(newCustomerDto.getCustomerSurname());
        customerById.setCustomerDiscount(newCustomerDto.getCustomerDiscount());
        customerById.setCustomerDistrict(newCustomerDto.getCustomerDistrict());
        customerRepository.save(customerMapper.convertToEntity(customerById));
    }

    @Override
    public List<String> getDifferentCustomerDistricts() {
        return customerRepository.getDifferentCustomerDistricts();
    }

    @Override
    public List<CustomerNameAndDiscountDto> findCustomersByDistrict(String district) {
        Iterable<CustomerEntity> iterable = customerRepository.findCustomerEntityByCustomerDistrict(district);
        ArrayList<CustomerNameAndDiscountDto> customersDto = new ArrayList<>();
        for (CustomerEntity customerEntity : iterable) {
            customersDto.add(new CustomerNameAndDiscountDto(
                    customerEntity.getCustomerSurname(),
                    customerEntity.getCustomerDiscount()
            ));
        }
        return customersDto;
    }
}
