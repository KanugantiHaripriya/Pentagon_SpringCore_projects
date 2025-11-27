package singleton;

public class General {

	public static void main(String[] args) {
		General g=new General();
		General g1=new General();
		General g2=new General();
		System.out.println(g);
		System.out.println(g1);
		System.out.println(g2);
	}
}


//Output:
//	singleton.General@65b3120a
//	singleton.General@6f539caf
//	singleton.General@79fc0f2f
	
//Note:
//	This is the general way of creating objects 
//	In this way we can create multiple objects
//	Each object has different addresses
	
	
	