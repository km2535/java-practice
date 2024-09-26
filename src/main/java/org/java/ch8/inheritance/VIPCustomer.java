package org.java.ch8.inheritance;

public class VIPCustomer {
	private int customerId;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;

	private  int agentId;
	double saleRatio;

	public VIPCustomer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}


	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public int getAgentId(){
		return agentId;
	}

	public String showCustomerInfo(){
		return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 "+ bonusPoint+"입니다.";
	}

}
