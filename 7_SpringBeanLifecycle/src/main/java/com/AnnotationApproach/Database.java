package com.AnnotationApproach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Database {
	
	@PostConstruct
	private void connect() {
		System.out.println("Connection estabilished");
	}
	
	void getData() {
		System.out.println("Data fetched...");
	}
	
	@PreDestroy
	private void disconnect() {
		System.out.println("Disconnection success");
	}
}
