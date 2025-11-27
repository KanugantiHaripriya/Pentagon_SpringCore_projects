package PaymentExample;

public class Shopping {
	private Payment p;
	
//	public Shopping(Payment p) {
//		this.p=p;
//	}
	
	void setPayment(Payment p) {
		this.p=p;
	}
	
	void doPayment(int amt) {
		if(p!=null) {
			p.pay(amt);
		}
		else {
			System.out.println("No payment mode is selected");
		}
	}

}
