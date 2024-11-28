package com.example.Employee.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.example.Employee.Service.EmployeeService;
import com.example.Employee.Service.EmployeeServiceImpl;

@Configuration
public class AppConfig {
	 @Bean
	    public EmployeeServiceImpl employeeService() {
	        return new EmployeeServiceImpl();
	    }

}
