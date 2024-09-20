package org.java.ch6.coffee;

public class Coffee {
	private final String coffeeName;
	private final int price;

	public Coffee(String coffeeName, int price) {
		this.coffeeName = coffeeName;
		this.price = price;
	}

	public String getCoffeeName() {
		return coffeeName;
	}
	public int getPrice() {
		return price;
	}

}
