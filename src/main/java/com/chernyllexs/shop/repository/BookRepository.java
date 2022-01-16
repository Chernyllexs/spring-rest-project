package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.BookDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
    @Query(value = "SELECT book_name FROM books GROUP BY book_name", nativeQuery = true)
    List<String>  getDifferentBookTitles();

    @Query(value = "SELECT book_price FROM books GROUP BY book_price", nativeQuery = true)
    List<String>  getDifferentBookPrices();

    @Query(value = "SELECT book_name, book_price FROM books GROUP BY book_price, book_name", nativeQuery = true)
    Map<String, Float> getDifferentBookNamesAndPrices();
}
