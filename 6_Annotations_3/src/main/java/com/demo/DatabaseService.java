package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
	
	@Autowired
	private Report report;
	
	@Bean
	void getDataFromDatabase() {
		report.getData();
	}
}
