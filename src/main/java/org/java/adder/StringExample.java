package org.java.adder;

public class StringExample {
	public static void main(String[] args) throws InterruptedException {
		String str1 = new String("hello");  // 힙 메모리에 생성
		String str2 = new String("world");  // 힙 메모리에 생성

		str1 = null;  // str1의 참조 제거
	}
}
