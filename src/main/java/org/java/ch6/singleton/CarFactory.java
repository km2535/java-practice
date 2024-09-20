package org.java.ch6.singleton;

public class CarFactory {
	private static final CarFactory instance = new CarFactory();
	private static int carNum = 10000;

	private CarFactory() {}

	public static CarFactory getInstance() {
		return instance;
	}

	public Car createCar(){
		carNum++;
		return new Car(carNum);
	}
}
