package org.java.ch6.singleton;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		Car myCar = carFactory.createCar();
		Car yourCar = carFactory.createCar();
		System.out.println(myCar.carNum);
		System.out.println(yourCar.carNum);
	}
}
