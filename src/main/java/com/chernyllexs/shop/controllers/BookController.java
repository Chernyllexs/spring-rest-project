package com.chernyllexs.shop.controllers;

import com.chernyllexs.shop.models.BookDto;
import com.chernyllexs.shop.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }

    @PatchMapping("/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody BookDto bookDto) {
        bookService.updateBookById(id, bookDto);
    }

    @PostMapping("/add")
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookDto getBook(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public void rewriteBook(@PathVariable Long id, @RequestBody BookDto bookDto) {
        bookService.rewriteBook(id, bookDto);
    }

    @GetMapping("/different-book-names")
    public List<String> getDifferentBookNames(){
        return bookService.getDifferentBookNames();
    }

    @GetMapping("/different-book-prices")
    public List<Float> getDifferentBookPrices(){
        return bookService.getDifferentBookPrices();
    }

    @GetMapping("/book-greater-or-about")
    public List<BookDto> getBookGreaterOrAbout(){
        return bookService.getBookGreaterOrAboutWindows();
    }
}
