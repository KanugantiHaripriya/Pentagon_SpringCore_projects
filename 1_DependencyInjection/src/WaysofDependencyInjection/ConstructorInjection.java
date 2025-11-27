package WaysofDependencyInjection;


//3. Constructor Injection
public class ConstructorInjection {
	String name;
	public ConstructorInjection(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		ConstructorInjection st = new ConstructorInjection("haripriya");
	}

}
