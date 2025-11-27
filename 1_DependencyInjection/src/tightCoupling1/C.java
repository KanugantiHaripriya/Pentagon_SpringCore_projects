package tightCoupling1;

public class C {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		B b = new B();
		b.m2();
	}
}


// Class c is directly creating the object of class A and class B. 
// Any changes to class A or class B will effect the c class.
// Class c is tightly coupled with class A or B

