package org.java.ch6.student;

public class Taxi {
	String taxiName;
	int passengerCount;
	int money;

	public Taxi(String taxiName){
		this.taxiName = taxiName;
	}

	public void take(int money){
		this.money += money;
		passengerCount++;
	}

	public void showInfo(){
		System.out.println(taxiName+"의 승객은 " + passengerCount  +"명이고, 수입은 " + money +"입니다.");
	}

}
