package org.java.ch10.example3;

public class BubbleSort implements Sort {
	@Override
	public void descending(int[] arr) {
		System.out.println("Bubble descending");
	}

	@Override
	public void ascending(int[] arr) {
		System.out.println("Bubble ascending");
	}

	@Override
	public void description(){
		Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}

}
