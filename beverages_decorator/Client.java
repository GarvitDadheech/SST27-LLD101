package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
		System.out.println("Cappuccino cost: " + coffee.cost());

		coffee = CondimentFactory.addMilk(coffee);
		System.out.println("Cappuccino with milk cost: " + coffee.cost());

		coffee = CondimentFactory.addSugar(coffee);
		System.out.println("Cappuccino with milk and sugar cost: " + coffee.cost());

		coffee = CondimentFactory.addChocolate(coffee);
		System.out.println("Cappuccino with milk, sugar and chocolate cost: " + coffee.cost());

		System.out.println("---");

		Beverage latteWithChocolate = CondimentFactory.addChocolate(new Latte());
		System.out.println("Latte with chocolate cost: " + latteWithChocolate.cost());
		

	}

}