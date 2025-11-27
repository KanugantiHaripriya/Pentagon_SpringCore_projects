package paymentExample.Beans;

public class Shopping {
	private Payment p;
	
	public Shopping() {
		System.out.println("Shopping Object created");
	}
	
	public Shopping(Payment p){
		System.out.println("Constructor Injection");
		this.p=p;
	}

	public void setP(Payment p) { //setter Injection need to generated with respect to the system
		System.out.println("Setter Injection");
		this.p = p;
	}

	void doPayment(int amt) {
		if(p!=null) {
			p.pay(amt);
		}
		else {
			System.out.println("No payment mode selected");
		}
	}
}
