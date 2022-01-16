package com.chernyllexs.shop.utill.mapper;

import com.chernyllexs.shop.entity.ShopEntity;
import com.chernyllexs.shop.models.ShopDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ShopMapper {
    private final ModelMapper modelMapper;

    public ShopMapper() {
        this.modelMapper = new ModelMapper();
    }

    public ShopDto convertToDto(ShopEntity shopEntity) {
        return modelMapper.map(shopEntity, ShopDto.class);
    }

    public ShopEntity convertToEntity(ShopDto shopDto) {
        return modelMapper.map(shopDto, ShopEntity.class);
    }
}
