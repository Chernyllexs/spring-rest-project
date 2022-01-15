package com.chernyllexs.shop.services;

import com.chernyllexs.shop.models.ShopDto;

import java.util.List;

public interface ShopService {
    void deleteShopById(Long id);

    void updateShopById(Long id, ShopDto updatedShopDto);

    void addShop(ShopDto newShopDto);

    List<ShopDto> getAllShops();

    ShopDto getShopById(Long id);

    void rewriteShop(Long id, ShopDto newShopDto);
}
