package org.java.ch13;

class Outer{
	int outNum = 20;
	static int sNum = 200;

	Runnable getRunnable(int i){
		int num = 100;

		// 지역 내부 클래스 정의
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				// num = 200; // 지역변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				// i = 100; // 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경 할 수 없어 오류 발생
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("sNum = " + sNum);
				System.out.println("Outer.sNum = " + Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
