package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
