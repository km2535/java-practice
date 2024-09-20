package org.java.ch6.coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
	private final String name;
	private int money;
	private int amount;
	private final List<String> coffeeName;

	public CoffeeShop(String name){
		this.name = name;
		coffeeName = new ArrayList<>();
	}

	public Coffee take(Coffee coffee){
		this.money += coffee.getPrice();
		coffeeName.add(coffee.getCoffeeName());
		this.amount++;
		return coffee;
	}

	public void showInfo(){
		System.out.println(name + "의 총 커피" + amount + "잔을 팔았고 총 수입은 " + money + "입니다.");
		System.out.println("판 커피 : ");
		for(String coffeeName : coffeeName){
			System.out.println(coffeeName);
		}
	}

}
