package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.ShopEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShopRepository extends CrudRepository<ShopEntity, Long> {

    List<ShopEntity> findShopEntityByShopDistrict(String district);
}
