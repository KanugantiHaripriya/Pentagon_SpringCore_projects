package com.xml;

public class MyBean {
	public void init() {
		System.out.println("My Bean initialised");
	}
	public void doSomething() {
		System.out.println("My Bean is in use");
	}
	public void destroy() {
		System.out.println("Spring Bean destroyed");
	}
}
