package carEngine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowRoom {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Config.xml");
		Car c=ctxt.getBean(Car.class);
		c.drive();
	}

}
