package com.example.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Entity.Employee;
import com.example.Employee.Repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl {
	 @Autowired
	    private EmployeeRepo employeeRepository;

	    public Employee getEmployeeById(Long id) {
	        return employeeRepository.findById(id).orElse(null);
	    }

	    public Employee createEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

}
