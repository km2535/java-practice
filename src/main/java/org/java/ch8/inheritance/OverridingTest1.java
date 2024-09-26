package org.java.ch8.inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer(10010, "이순신");
		customer.bonusPoint = 1000;

		VIPCustomerExtendParent customerExtendParent = new VIPCustomerExtendParent(10020, "김유신", 12345);
		customerExtendParent.bonusPoint = 1000;

		int price = 10000;
		System.out.println(customer.getCustomerName() + "님이 지불해야 하는 금액은 " + customer.calcPrice(price) + "원 입니다.");
		System.out.println(customerExtendParent.getCustomerName() + "님이 지불해야 하는 금액은 " + customerExtendParent.calcPrice(price) + "원 입니다.");
	}
}
