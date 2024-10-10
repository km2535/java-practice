package org.java.ch10.example3;

public interface Sort {
	
	void descending(int[] arr);

	void ascending(int[] arr);

	default void description(){
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
}
