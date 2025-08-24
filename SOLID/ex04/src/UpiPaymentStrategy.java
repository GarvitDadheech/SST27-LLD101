public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}