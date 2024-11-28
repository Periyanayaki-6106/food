package com.example.Library.Feign;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Library.Entity.Library;


@FeignClient("LIBRARY")
public interface LibraryInterface {
	 public ResponseEntity<List<Library>> getAllLibrarys();

	    
	    @GetMapping("/librarys/{id}")
	    public ResponseEntity<Library> getLibraryById(@PathVariable Long id);

	   
	    @PostMapping("/librarys")
	    public ResponseEntity<Library> createStudent(@RequestBody Library library);
	       

}
