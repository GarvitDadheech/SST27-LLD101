public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
}