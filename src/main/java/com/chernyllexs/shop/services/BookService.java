package com.chernyllexs.shop.services;

import com.chernyllexs.shop.models.BookDto;

import java.util.List;

public interface BookService {
    void deleteBookById(Long id);

    void updateBookById(Long id, BookDto updatedBookDto);

    void addBook(BookDto newBookDto);

    List<BookDto> getAllBooks();

    BookDto getBookById(Long id);

    void rewriteBook(Long id, BookDto newBookDto);
}
