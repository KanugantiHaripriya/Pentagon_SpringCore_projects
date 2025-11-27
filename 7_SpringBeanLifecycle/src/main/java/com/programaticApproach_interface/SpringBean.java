package com.programaticApproach_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringBean implements InitializingBean,DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Spring Bean object Initialized");
	}
	
	public void doSomething() {
		System.out.println("Spring Bean is in use");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Spring Bean destroyed");
		
	}

}
