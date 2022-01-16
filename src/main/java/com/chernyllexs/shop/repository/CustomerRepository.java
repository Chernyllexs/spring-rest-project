package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.CustomerEntity;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

    @Query(value = "SELECT customer_district FROM customers GROUP BY customer_district", nativeQuery = true)
    List<String> getDifferentCustomerDistricts();

    List<CustomerEntity> findCustomerEntityByCustomerDistrict(String customerDistrict);
}
