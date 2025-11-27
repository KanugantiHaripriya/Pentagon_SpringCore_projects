package carEngine;

public class ElectricMotor implements Engine{
	public ElectricMotor() {
		System.out.println("Electric Motor object is created");
	}

	@Override
	public void start() {
		System.out.println("Electric Motor Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Electric Motor Stopped");
		
	}

}
