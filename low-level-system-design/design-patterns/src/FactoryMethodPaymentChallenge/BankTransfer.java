package FactoryMethodPaymentChallenge;

public class BankTransfer implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Bank Transfer.");
    }
}
