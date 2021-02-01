package edu.lewisu.ood.week2;

public class Chicken extends BurgerIngredients {

	public Chicken(Burger burger) {
		this.burger = burger;
	}


	@Override
	public String details() {
		return burger.details() + " Chicken";
	}


	@Override
	public Double price() {
		return burger.price() + 10.0;
	}

}
