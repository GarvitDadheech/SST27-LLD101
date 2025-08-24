public class StandardShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 50 + 5 * shipment.weightKg;
    }
}