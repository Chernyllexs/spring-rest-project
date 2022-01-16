package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.BookEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
    @Query(value = "SELECT book_name FROM books GROUP BY book_name", nativeQuery = true)
    List<String>  getDifferentBookTitles();

    @Query(value = "SELECT book_price FROM books GROUP BY book_price", nativeQuery = true)
    List<Float>  getDifferentBookPrices();

    List<BookEntity> getBookEntityByBookNameContainingOrBookPriceGreaterThanOrderByBookName(String name, Float price);
}
