package PaymentExample;

public class Customer {
	public static void main(String[] args) {
		Cash c= new Cash();
		DebitCard dc =new DebitCard();
		CreditCard cc =new CreditCard();
		
		// Shopping s = new Shopping(dc); // Constructor Injection
		Shopping s =new Shopping();
		// s.p=cc; // Field Injection (not recommended)
		s.setPayment(c); // Setter Injection
		
		s.doPayment(500);
	}
}
