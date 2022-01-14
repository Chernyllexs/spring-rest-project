package com.chernyllexs.shop.repository;

import com.chernyllexs.shop.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
