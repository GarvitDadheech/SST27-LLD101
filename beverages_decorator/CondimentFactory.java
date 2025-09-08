package beverages_decorator;

public class CondimentFactory {
    public static Beverage addMilk(Beverage beverage) {
        return new MilkDecorator(beverage);
    }

    public static Beverage addSugar(Beverage beverage) {
        return new SugarDecorator(beverage);
    }

    public static Beverage addChocolate(Beverage beverage) {
        return new ChocolateDecorator(beverage);
    }
}
