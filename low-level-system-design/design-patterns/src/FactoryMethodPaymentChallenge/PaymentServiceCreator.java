package FactoryMethodPaymentChallenge;

public abstract class PaymentServiceCreator {
    public abstract PaymentService createPaymentService();

    public void process(double amount){
        PaymentService paymentService = createPaymentService();
        paymentService.processPayment(amount);
    }
}
