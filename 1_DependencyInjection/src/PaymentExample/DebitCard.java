package PaymentExample;

public class DebitCard implements Payment{

	@Override
	public void pay(int amt) {
		System.out.println("The Bill amt: "+amt+" is paid through DebitCard");
	}
	
}
