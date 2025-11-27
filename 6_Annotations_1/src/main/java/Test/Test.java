package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Sample.Config;
import Sample.Employee;
import Sample.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(Config.class);
	}

}
