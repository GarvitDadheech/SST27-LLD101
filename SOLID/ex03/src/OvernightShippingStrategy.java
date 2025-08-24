public class OvernightShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 120 + 10 * shipment.weightKg;
    }
}