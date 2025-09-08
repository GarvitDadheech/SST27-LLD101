package beverages_decorator;

public class SugarDecorator extends Decorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 5;
    }
}
