package com.example.Employee.Service;

import com.example.Employee.Entity.Employee;

public interface EmployeeService {
	 Employee getEmployeeById(Long id);

	    Employee createEmployee(Employee employee);

}
