package org.java.ch13Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("b");

		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s + " "));
		System.out.println();

		list.stream().sorted().forEach(s -> System.out.println(s + " "));
	}
}
