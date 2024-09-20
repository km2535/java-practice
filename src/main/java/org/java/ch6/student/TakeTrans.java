package org.java.ch6.student;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentJohn = new Student("John", 10000);
		Student edward = new Student("Edward", 10000);

		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();

		Subway subwayGreen = new Subway("2호선");
		studentJohn.takeSubway(subwayGreen);
		studentJohn.showInfo();
		subwayGreen.showInfo();

		Taxi kakaoTaxi = new Taxi("Kakao");
		edward.takeTaxi(kakaoTaxi);
		edward.showInfo();
		kakaoTaxi.showInfo();

	}
}
