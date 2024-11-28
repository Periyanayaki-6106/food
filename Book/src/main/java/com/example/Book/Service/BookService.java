package com.example.Book.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Book.Entity.Book;


public interface BookService {
	List<Book> getAllBooks();
	Book getBookById(Long id);
	Book createBook(Book book);

}
