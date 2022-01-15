package com.chernyllexs.shop.services;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.Book;
import com.chernyllexs.shop.repository.BookRepository;
import com.chernyllexs.shop.utill.exception.BookNotFoundException;
import com.chernyllexs.shop.utill.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private  BookRepository bookRepository;
    @Autowired
    private  BookMapper bookMapper;



    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void updateBookById(Long id, Book updatedBook) {

    }

    @Override
    public void addBook(Book newBook) {
        bookRepository.save(bookMapper.bookToBookEntity(newBook));
    }

    @Override
    public List<Book> getAllBooks() {
        Iterable<BookEntity> iterable = bookRepository.findAll();
        ArrayList<Book> books = new ArrayList<>();
        for (BookEntity bookEntity : iterable) {
            books.add(bookMapper.bookEntityToBook(bookEntity));
        }
        return books;
    }

    @Override
    public Book getBookById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException("Book not found: id = " + id));
        return bookMapper.bookEntityToBook(bookEntity);
    }

    @Override
    public void rewriteBook(Long id, Book newBook) {

    }


}
