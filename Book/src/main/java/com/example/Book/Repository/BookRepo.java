package com.example.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Book.Entity.Book;

public interface BookRepo  extends JpaRepository<Book, Long>{

}
