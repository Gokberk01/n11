package PaymentHomework.Test;

import PaymentHomework.Main.CreditCardPayment;
import PaymentHomework.Main.PaymentService;

public class Test {
    public static void main(String[] args)
    {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(4700);
    }
}
