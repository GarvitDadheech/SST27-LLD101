import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private final Map<String, PaymentStrategy> paymentStrategies = new HashMap<>();

    public PaymentService() {
        paymentStrategies.put("CARD", new CardPaymentStrategy());
        paymentStrategies.put("UPI", new UpiPaymentStrategy());
        paymentStrategies.put("WALLET", new WalletPaymentStrategy());
    }

    String pay(Payment p){
        if (paymentStrategies.containsKey(p.provider)) {
            return paymentStrategies.get(p.provider).pay(p.amount);
        }
        throw new RuntimeException("No provider");
    }
}