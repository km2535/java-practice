package org.java.ch6.coffee;

public class CoffeeMain {
	public static void main(String[] args) {
		Person kim = new Person("kim", 20000);
		Person lee = new Person("Lee", 20000);

		CoffeeShop starCoffee = new CoffeeShop("starCoffee");
		CoffeeShop kongCoffee = new CoffeeShop("kongCoffee");

		Coffee americano = new Coffee("Americano", 4000);
		Coffee latte = new Coffee("Latte", 5500);

		Coffee coffee1 = starCoffee.take(americano);
		Coffee coffee2 = kongCoffee.take(latte);

		kim.drink(coffee1);
		lee.drink(coffee2);

		kim.info();
		lee.info();

		starCoffee.showInfo();
		kongCoffee.showInfo();

	}
}
