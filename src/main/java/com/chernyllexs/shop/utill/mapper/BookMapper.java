package com.chernyllexs.shop.utill.mapper;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.Book;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface BookMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
