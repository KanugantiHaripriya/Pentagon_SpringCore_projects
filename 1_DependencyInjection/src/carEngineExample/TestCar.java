package carEngineExample;

public class TestCar {

	public static void main(String[] args) {
		
		PetrolEngine pe= new PetrolEngine();
		DieselEngine de = new DieselEngine();
		
		// Car c = new Car(); // Target Object
		// c.e=de; // Field Injection
		// c.setEngine(pe); // setter Injection
		Car c = new Car(pe); //Constructor Injection 
		c.drive();
		
	}

}
