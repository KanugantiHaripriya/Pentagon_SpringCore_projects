package WaysofDependencyInjection;


//1. Field Injection(variable)

public class FieldInjection {
	String name; 

	public static void main(String[] args) {
		FieldInjection s = new FieldInjection();
		s.name = "Hari"; // we are declaring the value with the help of object reference
	}

}


// We have 3 different ways for dependency injection
// 1. Field Injection(variable)
// 2. Setter Injection
// 3. Constructor Injection