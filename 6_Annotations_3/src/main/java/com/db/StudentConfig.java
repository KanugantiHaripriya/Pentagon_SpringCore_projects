package com.db;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StudentConfig {
	
	@Autowired
	private StudentService ss;
	
	@Bean
	void perform() {
		Scanner sc = new Scanner(System.in);
		boolean repeat =true;
		
		while(repeat) {
			System.out.println("Enter 1 for adding student details");
			System.out.println("Enter 2 for getting all student details");
			System.out.println("Enter 3 for exit");
			int choice = sc.nextInt();
			switch(choice) {
			
				case 1:
					System.out.println("Enter the id");
					int id= sc.nextInt();
					System.out.println("Enter the name");
					String name= sc.next();
					ss.add(id, name); 
					System.out.println("Student added successfully");
					System.out.println();
					break;
				case 2:
					System.out.println("Details of the student");
					System.out.println("----------------------------------------------");
					List<Student> std = ss.getallStudents();
					for(Student s:std) {
						System.out.println(s);
					}
					System.out.println("----------------------------------------------");
					System.out.println();
					break;
				case 3:
					System.out.println("Thank you :) ");
					repeat = false;
					break;
				default:
					System.out.println("No such option");
					break;
			}
		}
	}
}
