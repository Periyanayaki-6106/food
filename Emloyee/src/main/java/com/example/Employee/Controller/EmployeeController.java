package com.example.Employee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public String products(){
		return "Employees";
	}

}
