package edu.lewisu.ood.week2;

public class Lettuce extends BurgerIngredients {

	public Lettuce(Burger burger) {
		this.burger = burger;

	}
	
	@Override
	public String details() {
		return burger.details() + " Lettuce";
	}

	@Override
	public Double price() {
		return burger.price() +4.5 ;
	}
	
}
