package carEngineExample;

public class Car {
	Engine e; // capable of holding both Diesel and petrol engine
//
	public Car(Engine e) { // Constructor Injection
		this.e=e;
	}
	
	void setEngine(Engine e) { //setter Injection
		this.e=e;
	}
	
	void drive() {
		if(e!=null) {
			e.start();
		}
		else {
			System.out.println("No engine present inside the car");
		}
	}
}
