package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.PurchasesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchaseRepository extends CrudRepository<PurchasesEntity, Long> {

    @Query(value = "SELECT DISTINCT to_char(order_date, 'month') FROM purchases", nativeQuery = true)
    List<String> getDifferentMonths();

    @Query(value = "SELECT c.customer_surname, s.shop_name FROM purchases p" +
            " INNER JOIN customers c on c.customer_id = p.customer_id" +
            " INNER JOIN shops s on s.shop_id = p.shop_id", nativeQuery = true)
    List<String> getSurnameAndShop();

    @Query(value = "SELECT c.customer_surname, c.customer_discount, b.book_name, p.order_quantity, p.order_date FROM purchases p" +
            " INNER JOIN customers c on c.customer_id = p.customer_id" +
            " INNER JOIN books b on b.book_id = p.book_id", nativeQuery = true)
    List<String> getOrderDetails();

    @Query(value = "SELECT p.purchase_id, c.customer_surname, p.order_date, p.order_amount FROM purchases p" +
            " INNER JOIN customers c on c.customer_id = p.customer_id" +
            " WHERE p.order_amount > 5000", nativeQuery = true)
    List<String> getOrderDetailsA();
}
