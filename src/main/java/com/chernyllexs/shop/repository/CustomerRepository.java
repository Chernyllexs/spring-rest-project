package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

}
