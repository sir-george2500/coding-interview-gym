public class Main {

    public static void main(String[] args) {

        String user = "user123";
        double amount = 100.0;

        PaymentServices OrangePayment = new PaymentServices(new OrangePayAdapter());
        OrangePayment.makePayment(user, amount);

        PaymentServices MomoPayment = new PaymentServices(new MomoPayAdapter());
        MomoPayment.makePayment(user, amount);


    }

}