package beverages_decorator;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 10;
    }
}
