package org.example.structural.service;


import org.example.structural.dto.BookDto;
import org.example.structural.entity.Book;
import org.example.structural.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(Long id) {
        return bookRepository.findBookById(id);
    }

    public BookDto updateBook(Long id, BookDto bookDto) {
        Book book = bookRepository.findBookById(id);
        book.setPrice(bookDto.getPrice());
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        bookRepository.save(book);
        return bookDto;
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
