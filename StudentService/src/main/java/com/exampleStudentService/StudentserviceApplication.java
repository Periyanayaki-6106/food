package com.exampleStudentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages="com.exampleStudentservice.Feign")
@EnableDiscoveryClient
public class StudentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentserviceApplication.class, args);
	}

}
