package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentDB sdb;
	
	public void add(int id, String name) {
		sdb.addStudent(new Student(id,name));
	}
	
	public List<Student> getallStudents(){
		return sdb.getallStudents();
	}
}
