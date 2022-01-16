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
            " WHERE p.order_amount > 60000", nativeQuery = true)
    List<String> getOrderDetailsA();

    @Query(value = "SELECT c.customer_surname, s.shop_district ,p.order_date, c.customer_district FROM purchases p" +
            " INNER JOIN customers c on c.customer_id = p.customer_id" +
            " INNER JOIN shops s on s.shop_id = p.shop_id" +
            " WHERE s.shop_district = c.customer_district" +
            " AND EXTRACT(Month FROM order_date) >= 12" +
            " ORDER BY order_date", nativeQuery = true)
    List<String> getOrderDetailsB();

    @Query(value = "SELECT s.shop_name FROM purchases p" +
            " INNER JOIN customers c on c.customer_id = p.customer_id" +
            " INNER JOIN shops s on s.shop_id = p.shop_id" +
            " WHERE s.shop_district != 'Avtozavodsky'" +
            " AND (c.customer_discount >=10 AND c.customer_discount <=15)" +
            " ORDER BY s.shop_name", nativeQuery = true)
    List<String> getOrderDetailsC();

    @Query(value = "SELECT b.book_name, b.book_warehouse, b.book_quantity, b.book_price FROM purchases p" +
            " INNER JOIN books b on b.book_id = p.book_id" +
            " INNER JOIN shops s on s.shop_id = p.shop_id" +
            " WHERE b.book_warehouse = s.shop_district" +
            " AND b.book_quantity > 1" +
            " ORDER BY b.book_price", nativeQuery = true)
    List<String> getOrderDetailsD();
}
