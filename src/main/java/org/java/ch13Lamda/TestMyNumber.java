package org.java.ch13Lamda;

public class TestMyNumber {
	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(20,10));
	}
}
