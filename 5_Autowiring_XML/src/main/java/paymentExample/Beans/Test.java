package paymentExample.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//		To get the object which is created by the ioc
		Shopping shop=context.getBean(Shopping.class);
		shop.doPayment(434);
	}

}
