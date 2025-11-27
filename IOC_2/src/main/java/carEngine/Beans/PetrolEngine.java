package carEngine.Beans;

public class PetrolEngine implements Engine{
	public PetrolEngine() {
		System.out.println("Petrol Eninge Object is created");
	}

	@Override
	public void start() {
		System.out.println("Petrol Enigne Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol Enigne Stopped");	
	}

}
