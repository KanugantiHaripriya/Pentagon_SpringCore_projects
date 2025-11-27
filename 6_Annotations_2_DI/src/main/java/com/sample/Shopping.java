package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Shopping {
	
	@Autowired
	// @Qualifier("dc")
	private Payment p; /* Field Injection */
	
	public Shopping() {
		System.out.println("Shopping object created");
	}

	
	@Bean
	void doPayment() {
		if(p!=null) {
			p.pay();
		}
		else {
			System.out.println("No payment mode selected ");
		}
		
	}
}
