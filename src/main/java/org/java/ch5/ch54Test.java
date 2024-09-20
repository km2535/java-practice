package org.java.ch5;

import java.time.LocalDateTime;

public class ch54Test {
	public static void main(String[] args) {
		James james = new James(32, "james", true, 2);
		System.out.println(james.toString());

		LocalDateTime dateTime = LocalDateTime.of(2018, 3, 12, 0, 0);

		Customer customer = new Customer("abc123", "홍길순", "서울시 영등포구 여의도동 20번지");
		Product product = new Product("PD0345-12", "청소기");
		customer.buyProduct(product);
		Order order = new Order("201803120001", dateTime);
		order.order(customer);

		System.out.println(order.printOrder());
	}
}
