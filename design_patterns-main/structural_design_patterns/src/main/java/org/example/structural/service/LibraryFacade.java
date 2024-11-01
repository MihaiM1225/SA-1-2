package org.example.structural.service;


import org.example.structural.entity.Book;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class LibraryFacade {

    private final BookService bookService;

    LibraryFacade(BookService bookService) {

        this.bookService = bookService;
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public List<Book> getFeaturedBooks() {
        return bookService.getAllBooks();
    }
}
