public class DefaultTaxCalculator implements TaxCalculator {
    private final double taxRate;

    public DefaultTaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }
}