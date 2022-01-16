package com.chernyllexs.shop.services;

import com.chernyllexs.shop.entity.ShopEntity;
import com.chernyllexs.shop.models.ShopDto;
import com.chernyllexs.shop.models.ShopNameDto;
import com.chernyllexs.shop.repository.ShopRepository;
import com.chernyllexs.shop.utill.exception.ShopNotFoundException;
import com.chernyllexs.shop.utill.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public void deleteShopById(Long id) {
        shopRepository.deleteById(id);
    }

    @Override
    public void updateShopById(Long id, ShopDto updatedShopDto) {
        ShopDto shopById = getShopById(id);
        if (updatedShopDto.getShopName() != null && updatedShopDto.getShopName().isEmpty())
            shopById.setShopName(updatedShopDto.getShopName());
        if (updatedShopDto.getShopDiscount() != null)
            shopById.setShopDiscount(updatedShopDto.getShopDiscount());
        if (updatedShopDto.getShopDistrict() != null && updatedShopDto.getShopDistrict().isEmpty())
            shopById.setShopDistrict(updatedShopDto.getShopDistrict());
        shopRepository.save(shopMapper.convertToEntity(shopById));
    }

    @Override
    public void addShop(ShopDto newShopDto) {
        shopRepository.save(shopMapper.convertToEntity(newShopDto));
    }

    @Override
    public List<ShopDto> getAllShops() {
        Iterable<ShopEntity> iterable = shopRepository.findAll();
        ArrayList<ShopDto> shopsDto = new ArrayList<>();
        for (ShopEntity shopEntity : iterable) {
            shopsDto.add(shopMapper.convertToDto(shopEntity));
        }
        return shopsDto;
    }

    @Override
    public ShopDto getShopById(Long id) {
        ShopEntity shopEntity = shopRepository.findById(id).orElseThrow(() -> new ShopNotFoundException("Shop not found: id = " + id));
        return shopMapper.convertToDto(shopEntity);
    }

    @Override
    public void rewriteShop(Long id, ShopDto newShopDto) {
        ShopDto shopById = getShopById(id);
        shopById.setShopId(newShopDto.getShopId());
        shopById.setShopName(newShopDto.getShopName());
        shopById.setShopDiscount(newShopDto.getShopDiscount());
        shopById.setShopDistrict(newShopDto.getShopDistrict());
        shopRepository.save(shopMapper.convertToEntity(shopById));
    }

    @Override
    public List<ShopNameDto> getShopNameInDistrict() {
        Iterable<ShopEntity> iterable = shopRepository.findShopEntityByShopDistrict("Sovetckiy");
        ArrayList<ShopNameDto> shopNameDtos = new ArrayList<>();
        for (ShopEntity shopEntity : iterable) {
            shopNameDtos.add(new ShopNameDto(shopEntity.getShopName()));
        }
        return shopNameDtos;
    }
}
