package org.java.ch8.inheritance;

public class VIPCustomerExtendParent extends Customer{
	private int agentId;
	double saleRatio;

	public VIPCustomerExtendParent(){
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public VIPCustomerExtendParent(int customerId, String agentId){
		super(customerId, agentId);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public VIPCustomerExtendParent(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
		System.out.println("Vip customer extend parent created");
	}

	@Override
	public int calcPrice(int price){
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}

	public int getAgentId() {
		return agentId;
	}
}
