package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public class AppConfig {
	public AppConfig() {
		System.out.println("Configuration done");
	}

}
