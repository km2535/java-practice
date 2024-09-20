package org.java.ch5;

public class Customer {
	String customerId;
	String name;
	String address;
	Product product;

	Customer(String customerId, String name, String address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}

	void buyProduct(Product product) {
		this.product = product;
	}

	public String orderProduct() {
		return product.productId;
	}
}
