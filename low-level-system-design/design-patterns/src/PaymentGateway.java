public interface PaymentGateway {
    boolean processPayment( String accountId, double amount);
}
