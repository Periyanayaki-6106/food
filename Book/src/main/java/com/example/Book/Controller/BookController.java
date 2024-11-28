package com.example.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.Entity.Book;
import com.example.Book.Service.BookService;
import com.example.Book.Service.BookServiceImpl;

@RestController("/books")
public class BookController {
	
	@Autowired
    private BookServiceImpl bookService;

    // Get all students
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> students = bookService.getAllBooks();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // Get student by id
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
       Book book = bookService.getBookById(id);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new student
    @PostMapping
    public ResponseEntity<Book> createStudent(@RequestBody Book book) {
        Book createdBook = bookService.createBook(book);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

}
