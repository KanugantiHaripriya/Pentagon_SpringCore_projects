package carEngine;

public class PetrolEngine implements Engine{
	public PetrolEngine() {
		System.out.println("Petrol Engine object is created");
	}

	@Override
	public void start() {
		System.out.println("Petrol Engine started");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol Enigne stopped");
		
	}

}
