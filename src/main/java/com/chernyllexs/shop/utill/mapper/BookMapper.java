package com.chernyllexs.shop.utill.mapper;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper BOOK_MAPPER = Mappers.getMapper(BookMapper.class);
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
