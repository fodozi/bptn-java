package com.bptn.course._wk3_teachback;

// Interface Definition
interface PaymentOption {
	void pay(double amount);

}

//High-Level Module
class PaymentService {
	private PaymentOption paymentoption;

	// Constructor that accepting a PaymentOption interface
	public PaymentService(PaymentOption paymentoption) {
		this.paymentoption = paymentoption;
	}

	// Payment process method
	public void processPayment(double amount) { 
		paymentoption.pay(amount); // Delegate payment processing


	}
}

//Low-Level 1 CreditCard Payment
//class CreditCardPayment implements PaymentOption { 
//	@Override
//	public void pay(double amount) {
//		System.out.println("Paid $" + amount + " using Credit Card.");
//	}
//}

//Low-Level 2 GiftCard Payment
class GiftCardPayment implements PaymentOption { 
	@Override
	public void pay(double amount) {
		System.out.println("Paid $" + amount + " using Gift Card.");
	}
}




