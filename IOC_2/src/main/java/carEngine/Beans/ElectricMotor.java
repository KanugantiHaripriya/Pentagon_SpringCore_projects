package carEngine.Beans;

public class ElectricMotor implements Engine {
	public ElectricMotor() {
		System.out.println("Electric motor object created");
	}

	@Override
	public void start() {
		System.out.println("Electric Motor started ");
		
	}

	@Override
	public void stop() {
		System.out.println("Electric Motor stopped ");
		
	}
	
	

}
