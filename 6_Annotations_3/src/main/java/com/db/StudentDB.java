package com.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDB {
	private List<Student> students= new ArrayList<>();
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public List<Student> getallStudents(){
		return students;
	}
}
