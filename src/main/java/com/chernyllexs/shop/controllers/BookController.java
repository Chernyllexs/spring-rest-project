package com.chernyllexs.shop.controllers;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.Book;
import com.chernyllexs.shop.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private BookServiceImpl bookService;
    
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBookById(id);
    }

    @PatchMapping("/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book){
        bookService.updateBookById(id, book);
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public void rewriteBook(@PathVariable Long id, @RequestBody Book book){
        bookService.rewriteBook(id, book);
    }
}
