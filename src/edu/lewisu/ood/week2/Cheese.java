package edu.lewisu.ood.week2;

public class Cheese extends BurgerIngredients {

	private double cheesePrice = 3.0;

	public Cheese(Burger burger) {
		this.burger = burger;

	}

	@Override
	public String details() {
		return burger.details() + " Cheese";
	}

	@Override
	public Double price() {
		return burger.price() + cheesePrice;
	}

}
