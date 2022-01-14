package com.chernyllexs.shop.services;

import com.chernyllexs.shop.models.Book;

import java.util.List;

public interface BookService {
    void deleteBookById(Long id);
    void updateBookById(Long id, Book updatedBook);
    void addBook(Book newBook);
    List<Book> getAllBooks();
    Book getBookById(Long id);
    void rewriteBook(Long id, Book newBook);
}
