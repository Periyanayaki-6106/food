package com.example.Book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Book.Entity.Book;
import com.example.Book.Repository.BookRepo;


@Service
public class BookServiceImpl {
	@Autowired
    private BookRepo bookRepository;

    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    
    public Book createBook(Book book) {
        // Additional logic if needed (e.g., validation)
        return bookRepository.save(book);
    }

}
