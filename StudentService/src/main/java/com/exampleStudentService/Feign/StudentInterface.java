package com.exampleStudentService.Feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.exampleStudentService.Entity.Student;
@FeignClient("STUDENT")
public interface StudentInterface {
	@GetMapping
    public ResponseEntity<List<Student>> getAllStudents();

    // Get student by id
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id);

    // Create a new student
    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student student);
       
	

}
