package in.ashokit;

public class DebitcardPayment implements IPayment {

	@Override
	public String pay(double amount) {

		//logic for debit card payment.
		
		return "Payment successful through DEBIT CARD";
	}

}
