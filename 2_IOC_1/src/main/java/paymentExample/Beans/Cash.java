package paymentExample.Beans;

public class Cash implements Payment { 
	
	public Cash() {
		System.out.println("Cash object created");
	}

	@Override
	public void pay(int amt) {
		System.out.println("The Bill amt: "+amt+" is paid through cash");
	}
	

}
