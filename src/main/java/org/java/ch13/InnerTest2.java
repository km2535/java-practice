package org.java.ch13;


class OutClass2 {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;

	public OutClass2(){
		inClass = new InClass();
	}

	static class InClass{
		int inNum = 20;
		static int sInNum = 200;
		void inTest(){
			System.out.println("InClass inNum = " + inNum);
			System.out.println("InClass sInNum = " + sInNum);
			System.out.println("OutClass sNum = " + sNum);
		}

		static void sTest(){
			System.out.println("OutClass sNum = " + sNum);
			System.out.println("InClass sInNum =  " + sInNum);
		}
	}
	public void usingClass(){
		inClass.inTest();
	}
}


public class InnerTest2 {
	public static void main(String[] args) {
		OutClass2.InClass outClass = new OutClass2.InClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.inTest();
		OutClass2.InClass.sTest();

	}
}
