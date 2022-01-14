package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.Purchases;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchases, Long> {

}
