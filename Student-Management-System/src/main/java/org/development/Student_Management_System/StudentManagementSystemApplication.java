package org.development.Student_Management_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Student-Management-System Started.");
	}

}
