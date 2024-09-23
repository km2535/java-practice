package org.java.adder;

public class Adder {
	int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		Adder adder = new Adder();
		int result = adder.add(1, 2);
		System.out.println(result);
	}
}
