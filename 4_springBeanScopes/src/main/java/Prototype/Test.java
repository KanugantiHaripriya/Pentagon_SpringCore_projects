package Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Prototype.xml");
		Employee e1 = context.getBean(Employee.class);
		Employee e2 = context.getBean(Employee.class);
		Employee e3 = context.getBean(Employee.class);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}



//Output(as its scope is prototype it creates multiple objects so the address is different for different objects):
//	Employee object created
//	Employee object created
//	Employee object created
//	Prototype.Employee@2357d90a
//	Prototype.Employee@6328d34a
//	Prototype.Employee@145eaa29
