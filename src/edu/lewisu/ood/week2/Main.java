package edu.lewisu.ood.week2;

public class Main {
	public static void main(String[] args) {

		Burger burgerChicken = FactoryPattern.createBurger(Burger.CHICKEN);
		System.out.println("Your Order - " + burgerChicken.details());
		System.out.println("Your total amount is - $" + burgerChicken.price());

		Burger burgerChickenWithCheese = FactoryPattern.createBurger(Burger.CHICKENWITHCHEESE);
		System.out.println("Your Order - " + burgerChickenWithCheese.details());
		System.out.println("Your total amount is - $" + burgerChickenWithCheese.price());

		Burger burgerChickenWithLettuce = FactoryPattern.createBurger(Burger.CHICKENWITHLETTUCE);
		System.out.println("Your Order - " + burgerChickenWithLettuce.details());
		System.out.println("Your total amount is - $" + burgerChickenWithLettuce.price());

	}
}
