package com.programaticApproach_interface;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctxt  = new ClassPathXmlApplicationContext("SpringBean.xml");
		SpringBean sb = ctxt.getBean(SpringBean.class);
		sb.doSomething();
		ctxt.close();
	}

}
