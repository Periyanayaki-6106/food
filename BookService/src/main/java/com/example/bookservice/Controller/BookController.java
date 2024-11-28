package com.example.bookservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookservice.Entity.Book;
import com.example.bookservice.Feign.BookInterface;


@RequestMapping("/books")
@RestController
public class BookController {
	@Autowired
    private BookInterface bookService;
    
    @Autowired
    public BookController(BookInterface studentService) {
    	super();
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        
            return bookService.getBookById(id);
        
    }
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
    
        return bookService.createBook(book);
    }


}
