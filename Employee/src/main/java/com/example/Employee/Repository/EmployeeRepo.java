package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
