package singleton;

public class SingletonDesignPattern {
	static SingletonDesignPattern s;
	
	private SingletonDesignPattern() {
		System.out.println("Object created");
	}
	
	static {
		s= new SingletonDesignPattern();
	}
	
	static SingletonDesignPattern getObject() {//static methods can invoke or call by class name with dot operator
		return s;
	}

	
	
	public static void main(String[] args) {
		SingletonDesignPattern s1 = SingletonDesignPattern.getObject();
		SingletonDesignPattern s2= SingletonDesignPattern.getObject();
		
		if(s1==s2) {
			System.out.println("Same Objects");
		}
		else {
			System.out.println("Different objects");
		}
		
	}

}

//Output:
//	Object created
//	Same Objects

//Singleton classes: It is a class allowed to create only one object
//Advantages of Singleton Design pattern:
//	Instead of creating separate object we can create a single object
//	We can reuse the same object (Objects are costly resources)
//	Improves the memory utilization and performance of the system.

