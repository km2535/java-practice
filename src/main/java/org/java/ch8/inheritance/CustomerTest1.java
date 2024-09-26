package org.java.ch8.inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerId(10010);
		customer.setCustomerName("이순신");
		customer.bonusPoint = 1000;

		System.out.println(customer.showCustomerInfo());

		VIPCustomerExtendParent vipCustomer = new VIPCustomerExtendParent();
		vipCustomer.setCustomerId(10010);
		vipCustomer.setCustomerName("김유신");
		vipCustomer.bonusPoint = 1000;
		System.out.println(vipCustomer.showCustomerInfo());

		Customer customer2 = new VIPCustomerExtendParent();
		//customer2.getAgentId(); 자식 클래스가 부모 타입으로 선언되어 자식 내부의 메소드 호출은 되지 않음

	}
}
