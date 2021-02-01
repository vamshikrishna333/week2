package edu.lewisu.ood.week2;

public class FactoryPattern {

	public static Burger createBurger(String type){
		if(type.equals(Burger.CHICKEN)){
			Burger bread = new Bread();
			Burger burgerChicken = new Chicken(bread);
			return burgerChicken;
		}else if(type.equals(Burger.CHICKENWITHLETTUCE)){
			Burger bread = new Bread();
			Burger burgerChicken = new Lettuce(bread);
			return burgerChicken;
		}else if(type.equals(Burger.CHICKENWITHCHEESE)){
			Burger bread = new Bread();
			Burger burgerChicken = new Chicken(bread);
			Burger burgerChickenWithChesse = new Cheese(burgerChicken);
			return burgerChickenWithChesse;
		}else{
			return null;
		}
	}

	

}
