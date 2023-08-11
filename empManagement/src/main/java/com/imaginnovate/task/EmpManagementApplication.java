package com.imaginnovate.task;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmpManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManagementApplication.class, args);
		System.out.println("good to go");
	}

	@Bean
	public ModelMapper getMapper() {

		return new ModelMapper();
	}

}
