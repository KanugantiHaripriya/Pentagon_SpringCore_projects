package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Bean.xml");
		MyBean bean =ctxt.getBean(MyBean.class);
		bean.doSomething();
		
		ClassPathXmlApplicationContext ct = (ClassPathXmlApplicationContext)ctxt;
		
		ct.close(); // to close the IOC where we can destroy the object
	}
}

