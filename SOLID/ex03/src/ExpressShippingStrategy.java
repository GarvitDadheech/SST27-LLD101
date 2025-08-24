public class ExpressShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 80 + 8 * shipment.weightKg;
    }
}