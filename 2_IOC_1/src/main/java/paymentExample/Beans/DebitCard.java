package paymentExample.Beans;

public class DebitCard implements Payment{
	
	public DebitCard() {
		System.out.println("Debit card object created");
	}

	@Override
	public void pay(int amt) {
		System.out.println("The Bill amt: "+amt+" is paid through Debit Card");
		
	}
	
	

}
