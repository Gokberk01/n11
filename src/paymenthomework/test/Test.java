package paymenthomework.test;

import paymenthomework.main.CreditCardPayment;
import paymenthomework.main.PaymentService;

public class Test {
    public static void main(String[] args)
    {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(4700);
    }
}
