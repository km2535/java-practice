package org.java.ch7;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();

		books.add(new Book("태백산맥", "조정래"));
		books.add(new Book("데미안", "헤르만"));
		books.add(new Book("어떻게 살 것인가?", "유시민"));
		books.add(new Book("토지", "박경리"));
		books.add(new Book("어린왕자", "생텍쥐페리"));


		for(Book book : books){
			book.showBookInfo();
		}
	}
}
