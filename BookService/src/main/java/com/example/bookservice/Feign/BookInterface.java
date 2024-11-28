package com.example.bookservice.Feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.bookservice.Entity.Book;


@FeignClient("STUDENT")
public interface BookInterface {
	@GetMapping
    public ResponseEntity<List<Book>> getAllBooks();

    // Get student by id
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id);

    // Create a new student
    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book);
       
	

}
