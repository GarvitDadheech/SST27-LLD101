package beverages_decorator;

public class ChocolateDecorator extends Decorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 15;
    }
}
