package beverages_decorator;

public abstract class Decorator extends Beverage {
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
