public class MomoPay {
    public void sendMoney(String userid, double amount) {
        System.out.println("Processing MomoPay payment of amount: " + amount);
        // Add MomoPay specific payment processing logic here
        System.out.println("MomoPay processed $" + amount + " for user " + userid);
    }
}
