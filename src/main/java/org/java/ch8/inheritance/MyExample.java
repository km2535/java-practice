package org.java.ch8.inheritance;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("이 제품은: " + name + ", 가격은 " + price);
	}
}

// 하위 클래스: Electronics (전자제품)
// Electronics is-a Product
class Electronics extends Product {
	private int warrantyPeriod; // 보증 기간 (개월)

	public Electronics(String name, int price, int warrantyPeriod) {
		super(name, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("품질 보증 기간 : " + warrantyPeriod + " 월");
	}
}

// 하위 클래스: Furniture (가구)
// Furniture is-a Product
class Furniture extends Product {
	private String material;

	public Furniture(String name, int price, String material) {
		super(name, price);
		this.material = material;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("재질 : " + material);
	}
}


public class MyExample {
	public static void main(String[] args) {
		Product phone = new Electronics("Smartphone", 2000, 24);
		Product chair = new Furniture("Office Chair", 3000, "Leather");

		phone.displayDetails();
		chair.displayDetails();
	}
}