package com.microservice.Department.microservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.Department.microservice.entity.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Application.class, args);
		Department department = new Department();
		department.setDepartmentAddress("ASER-883 , Udyogbihar :gurgaon");
		department.setDepartmentCode("AEDC");
		department.setDepartmentName("Computer IT");
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println(objectMapper.writeValueAsString(department));
	}

}
