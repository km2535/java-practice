package org.java.ch13Stream;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();

		System.out.println(sumVal);
		System.out.println(count);
	}
}
