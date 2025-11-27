package carEngine;

public class Car {
	private Engine e;
	
	public Car() {
		System.out.println("car object created with zero parameters");
	}
	
	public Car(Engine e) {
		System.out.println("Car object created with parameters");
		System.out.println("Constructor Injection");
		this.e=e;
	}
	
	
	public void setE(Engine e) {
		System.out.println("Setter Injection");
		this.e = e;
	}

	void drive() {
		if(e!=null) {
			e.start();
			System.out.println("Journey started");
			e.stop();	
			System.out.println("Journey ended");
		}
		else {
			System.out.println("No Engine available");
		}
	}
	
}
