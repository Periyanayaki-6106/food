package com.example.Library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.Entity.Library;
import com.example.Library.Feign.LibraryInterface;

@RestController
public class LibraryController {
	@Autowired
    private LibraryInterface libraryService;
    
    @Autowired
    public LibraryController(LibraryInterface libraryService) {
    	super();
        this.libraryService = libraryService;
    }

    @GetMapping
    public ResponseEntity<List<Library>> getAllLibrarys() {
        
        return libraryService.getAllLibrarys();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Library> getLibraryById(@PathVariable("id") Long id) {
        
            return libraryService.getLibraryById(id);
        
    }
    @PostMapping
    public ResponseEntity<Library> addLibrary(@RequestBody Library library) {
    
        return libraryService.createLibrary(library);
    }


}
