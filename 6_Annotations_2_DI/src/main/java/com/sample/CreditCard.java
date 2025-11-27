package com.sample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cc")
//@Primary
public class CreditCard implements Payment{
	
	public CreditCard() {
		System.out.println("Credit Card object created");
	}

	@Override
	public void pay() {
		System.out.println("Paid through Credit Card");
		
	}
	
}
