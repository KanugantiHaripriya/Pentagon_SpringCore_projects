package WaysofDependencyInjection;

// 2. Setter Injection
public class SetterInjection {
	String name;
	
	// we are declaring the variable using setter method
	void setName(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		SetterInjection s = new SetterInjection();
		s.setName("Priya");
	}

}
