package paymentExample.Beans;

public class CreditCard implements Payment{
	public CreditCard() {
		System.out.println("Credit Card object created");
	}

	@Override
	public void pay(int amt) {
		System.out.println("The Bill amt: "+amt+" is paid through Credit card");
	}

}
