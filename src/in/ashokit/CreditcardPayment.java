package in.ashokit;

public class CreditcardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		//logic for credit card payment.
		return "Payment successful through CREDIT CARD";
	}

}
