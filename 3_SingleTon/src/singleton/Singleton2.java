package singleton;

public class Singleton2 {
	static Singleton2 s ;
	
	public Singleton2() {
		System.out.println("Object created");
	}
	
	static Singleton2 getObject() {
		if(s==null) {
			s= new Singleton2();
			return s;
		}
		else {
			return s;
		}
	}

	public static void main(String[] args) {
		Singleton2 s1 = Singleton2.getObject();
		System.out.println(s1);
		Singleton2 s2= Singleton2.getObject();
		System.out.println(s2);
		
		
		if(s1==s2) {
			System.out.println("Same Objects");
		}
		else {
			System.out.println("Different objects");
		}
	}

}



	