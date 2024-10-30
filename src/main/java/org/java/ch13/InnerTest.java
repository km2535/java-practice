package org.java.ch13;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;

	public OutClass(){
		inClass = new InClass();
	}

	class InClass{
		int inNum = 20;
		//static int sInNum = 200;
		void inTest(){
			num+=20;
			System.out.println("OutClass inNum = " + inNum);
			System.out.println("OutClass sNum = " + sNum);
			System.out.println("OutClass num = " + num);
		}
	}
	public void usingClass(){
		inClass.inTest();
	}
}

public class InnerTest{
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
	}
}
