package com.chernyllexs.shop.utill.mapper;

import com.chernyllexs.shop.entity.CustomerEntity;
import com.chernyllexs.shop.models.CustomerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    private final ModelMapper modelMapper;

    public CustomerMapper() {
        this.modelMapper = new ModelMapper();
    }

    public CustomerDto convertToDto(CustomerEntity customerEntity) {
        return modelMapper.map(customerEntity, CustomerDto.class);
    }

    public CustomerEntity convertToEntity(CustomerDto customerDto) {
        return modelMapper.map(customerDto, CustomerEntity.class);
    }
}
