package carEngine.Beans;

public class DieselEngine implements Engine{

	public DieselEngine() {
		System.out.println("Petrol Eninge Object is created");
	}

	@Override
	public void start() {
		System.out.println(" Diesel Enigne Started");
		
	}

	@Override
	public void stop() {
		System.out.println(" Diesel Enigne Stopped");	
	}

}
