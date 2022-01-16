package com.chernyllexs.shop.utill.mapper;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class BookMapper {
    private final ModelMapper modelMapper;

    public BookMapper() {
        this.modelMapper = new ModelMapper();
    }

    public BookDto convertToDto(BookEntity bookEntity) {
        return modelMapper.map(bookEntity, BookDto.class);
    }

    public BookEntity convertToEntity(BookDto bookDto) {
        return modelMapper.map(bookDto, BookEntity.class);
    }
}
