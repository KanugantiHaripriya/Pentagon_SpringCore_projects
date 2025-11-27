package PaymentExample;

public class CreditCard implements Payment {

	@Override
	public void pay(int amt) {
		System.out.println("The Bill amt: "+amt+" is paid through CreditCard");
	}

}
