package PaymentHomework.Main;

public class PaymentService {

    private PaymentMethod paymentMethod;

    public PaymentService (PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public boolean processPayment(double amount) {
        return paymentMethod.pay(amount);
    }

}
