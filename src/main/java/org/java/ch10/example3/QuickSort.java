package org.java.ch10.example3;

public class QuickSort implements Sort {
	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}
}
