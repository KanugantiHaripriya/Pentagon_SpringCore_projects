package Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopes {

	public static void main(String[] args) {
		
		ApplicationContext ctxt =  new ClassPathXmlApplicationContext("Beans.xml");
		Employee e1 = ctxt.getBean(Employee.class);
		System.out.println(e1);
		
		Employee e2 = ctxt.getBean(Employee.class);
		System.out.println(e2);
		
		if(e1==e2) {
			System.out.println("same object");
		}
		else {
			System.out.println("different object");
		}
		
	}

}
