package org.java.ch6.coffee;

public class Person {
	private final String name;
	private int money;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void drink(Coffee coffee){
		this.money -= coffee.getPrice();
	}

	public void info(){
		System.out.println(name + "의 잔고는 : " + money);
	}
}
