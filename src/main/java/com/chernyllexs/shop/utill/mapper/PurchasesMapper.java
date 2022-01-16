package com.chernyllexs.shop.utill.mapper;

import com.chernyllexs.shop.entity.PurchasesEntity;
import com.chernyllexs.shop.models.PurchasesDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PurchasesMapper {
    private final ModelMapper modelMapper;

    public PurchasesMapper() {
        this.modelMapper = new ModelMapper();
    }

    public PurchasesDto convertToDto(PurchasesEntity purchasesEntity) {
        return modelMapper.map(purchasesEntity, PurchasesDto.class);
    }

    public PurchasesEntity convertToEntity(PurchasesDto purchasesDto) {
        return modelMapper.map(purchasesDto, PurchasesEntity.class);
    }
}
