package com.bptn.course._wk3_teachback;

public class Main {

	public static void main(String[] args) {
//		 Using Credit Card Payment
					PaymentOption creditCard = new CreditCardPayment();
					PaymentService paymentService1 = new PaymentService(creditCard);
					paymentService1.processPayment(100.0);
					
//					PaymentOption giftCard = new GiftCardPayment();
//					PaymentService paymentService2 = new PaymentService(giftCard);
//					paymentService2.processPayment(60.0);

	}
}
