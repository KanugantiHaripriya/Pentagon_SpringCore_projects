package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(Shopping.class);
	}

}
