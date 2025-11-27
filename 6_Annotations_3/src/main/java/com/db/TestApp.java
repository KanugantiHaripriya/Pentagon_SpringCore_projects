package com.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentConfig sc = cxt.getBean(StudentConfig.class);
		sc.perform();
	}

}
