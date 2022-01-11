package com.chernyllexs.shop.controllers;

import com.chernyllexs.shop.entity.Book;
import com.chernyllexs.shop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private BookRepository bookRepository;
    
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }

    @PatchMapping("/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book){

    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookRepository.save(book);
    }

    @GetMapping
    public Iterable<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable Long id){
        return bookRepository.findById(id);
    }

    @PutMapping("/{id}")
    public void rewriteBook(@PathVariable Long id, @RequestBody Book book){
        book.setBookId(id);
        bookRepository.save(book);
    }
}
