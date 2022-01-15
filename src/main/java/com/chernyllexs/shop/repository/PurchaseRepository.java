package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.PurchasesEntity;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<PurchasesEntity, Long> {

}
