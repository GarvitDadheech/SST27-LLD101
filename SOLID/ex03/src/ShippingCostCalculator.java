import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator {
    private final Map<String, ShippingStrategy> strategies = new HashMap<>();

    public ShippingCostCalculator() {
        strategies.put("STANDARD", new StandardShippingStrategy());
        strategies.put("EXPRESS", new ExpressShippingStrategy());
        strategies.put("OVERNIGHT", new OvernightShippingStrategy());
    }

    double cost(Shipment s) {
        ShippingStrategy strategy = strategies.get(s.type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown type: " + s.type);
        }
        return strategy.calculateCost(s);
    }
}
