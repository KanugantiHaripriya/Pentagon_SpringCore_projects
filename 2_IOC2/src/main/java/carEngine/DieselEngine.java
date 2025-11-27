package carEngine;

public class DieselEngine implements Engine{
	public DieselEngine() {
		System.out.println("Diesel Engine object created");
	}

	@Override
	public void start() {
		System.out.println("Diesel Engine started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine stopped");
	}

}
