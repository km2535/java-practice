package org.java.ch5;

import java.time.LocalDateTime;

public class Order {
	String orderNumber;
	LocalDateTime orderDate;
	Customer customer;

	public Order(String orderNumber, LocalDateTime orderDate) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
	}

	public void order(Customer customer) {
		this.customer = customer;
	}

	String printOrder(){
		return "주문번호 : " + orderNumber + "\n"
			+ "주문자 아이디 : " + customer.customerId + "\n"
			+ "주문 날짜 : " + orderDate + "\n"
			+ "주문자 이름 : " + customer.name + "\n"
			+"주문 상품 번호 : " + customer.orderProduct() + "\n"
			+ "배송 주소 : " + customer.address;
	}
}
