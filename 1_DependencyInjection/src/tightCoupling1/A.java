package tightCoupling1;

public class A {
	
//	A(String a){
//	} //if you use this code the class C will get effected because of tight coupling 
	// Tightly coupled means that two components of a system depend on each other very closely. If one changes, the other usually has to change as well. Because of this strong dependency, the parts are harder to modify, test, or reuse independently.
	
	void m1() {
		System.out.println("This is m1 method present inside class A");
	}
}
