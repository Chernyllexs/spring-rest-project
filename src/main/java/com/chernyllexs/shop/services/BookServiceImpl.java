package com.chernyllexs.shop.services;

import com.chernyllexs.shop.entity.BookEntity;
import com.chernyllexs.shop.models.BookDto;
import com.chernyllexs.shop.repository.BookRepository;
import com.chernyllexs.shop.utill.exception.BookNotFoundException;
import com.chernyllexs.shop.utill.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void updateBookById(Long id, BookDto updatedBookDto) {
        BookDto bookById = getBookById(id);
        if (updatedBookDto.getBookName() != null && !updatedBookDto.getBookName().isEmpty())
            bookById.setBookName(updatedBookDto.getBookName());
        if (updatedBookDto.getBookPrice() != null && !updatedBookDto.getBookPrice().isNaN())
            bookById.setBookPrice(updatedBookDto.getBookPrice());
        if (updatedBookDto.getBookQuantity() != null)
            bookById.setBookQuantity(updatedBookDto.getBookQuantity());
        if (updatedBookDto.getBookWarehouse() != null && !updatedBookDto.getBookWarehouse().isEmpty())
            bookById.setBookWarehouse(updatedBookDto.getBookWarehouse());
        bookRepository.save(bookMapper.convertToEntity(bookById));
    }

    @Override
    public void addBook(BookDto newBookDto) {
        bookRepository.save(bookMapper.convertToEntity(newBookDto));
    }

    @Override
    public List<BookDto> getAllBooks() {
        Iterable<BookEntity> iterable = bookRepository.findAll();
        ArrayList<BookDto> booksDto = new ArrayList<>();
        for (BookEntity bookEntity : iterable) {
            booksDto.add(bookMapper.convertToDto(bookEntity));
        }
        return booksDto;
    }

    @Override
    public BookDto getBookById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found: id = " + id));
        return bookMapper.convertToDto(bookEntity);
    }

    @Override
    public void rewriteBook(Long id, BookDto newBookDto) {
        BookDto bookById = getBookById(id);
        bookById.setBookId(newBookDto.getBookId());
        bookById.setBookName(newBookDto.getBookName());
        bookById.setBookPrice(newBookDto.getBookPrice());
        bookById.setBookQuantity(newBookDto.getBookQuantity());
        bookById.setBookWarehouse(newBookDto.getBookWarehouse());
        bookRepository.save(bookMapper.convertToEntity(bookById));
    }
}
