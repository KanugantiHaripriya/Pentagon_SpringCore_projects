package com.sample;

import org.springframework.stereotype.Component;

@Component("dc")
public class DebitCard implements Payment{
	
	public DebitCard() {
		System.out.println("Debit Card object created");
	}

	@Override
	public void pay() {
		System.out.println("Payment paid through Debit Card");	
	}

}
