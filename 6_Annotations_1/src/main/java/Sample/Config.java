package Sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// @Component
@Configuration
@ComponentScan(basePackages= {"Example","Sample"})
public class Config {
	public Config() {
		System.out.println("Config object created");
	}

}
