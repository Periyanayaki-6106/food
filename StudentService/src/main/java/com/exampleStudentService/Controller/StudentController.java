package com.exampleStudentService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.exampleStudentService.Entity.Student;
import com.exampleStudentService.Feign.StudentInterface;



@RequestMapping("/students")
@RestController


public class StudentController {
	 @Autowired
	    private StudentInterface studentService;
	    
	    @Autowired
	    public StudentController(StudentInterface studentService) {
	    	super();
	        this.studentService = studentService;
	    }

	    @GetMapping
	    public ResponseEntity<List<Student>> getAllStudents() {
	        
	        return studentService.getAllStudents();
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
	        
	            return studentService.getStudentById(id);
	        
	    }
	    @PostMapping
	    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
	    
	        return studentService.createStudent(student);
	    }

	   
	
	
}
