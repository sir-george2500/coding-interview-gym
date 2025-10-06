package FactoryMethodPaymentChallenge;

public class Paypal implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
