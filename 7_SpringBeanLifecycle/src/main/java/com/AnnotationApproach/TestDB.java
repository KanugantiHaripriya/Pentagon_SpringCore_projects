package com.AnnotationApproach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDB {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(Database.class);
		Database db = ctxt.getBean(Database.class);
		db.getData();
		ctxt.close();
	}

}
