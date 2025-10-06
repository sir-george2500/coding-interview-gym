package FactoryMethodPaymentChallenge;

public class PayPalCreator extends PaymentServiceCreator {
    @Override
    public PaymentService createPaymentService() {
        return new Paypal();
    }
}
