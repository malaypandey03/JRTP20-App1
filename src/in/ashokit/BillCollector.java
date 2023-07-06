package in.ashokit;

public class BillCollector {
	
	private IPayment payment;
	
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public BillCollector(IPayment payment) {
//		super();
		this.payment = payment;
	}

	public BillCollector() {
		// TODO Auto-generated constructor stub
	}

	public void collectPayment(double amount) {
		
		String status = payment.pay(amount);
		System.out.println(status);
		
	}


}
