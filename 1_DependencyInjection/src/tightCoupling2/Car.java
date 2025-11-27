package tightCoupling2;

public class Car extends Engine{
	public void drive() {
		start();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}


//Car is directly creating the object of engine.
// Any changes to Engine will effect on car.
// If we want to change from one engine to another engine then we should modify the car class code
//Car is tightly coupled with engine

//Car is extending engine class
//Car class can’t use the inheritance in future
//Any changes in Engine class will effect on car class
//Car is tightly couple with engine

// Note: It is not recommended to develop classes with tightly coupling
