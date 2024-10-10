package org.java.ch10.example2;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelf = new BookShelf();
		shelf.enQueue("태백산맥 1");
		shelf.enQueue("태백산맥 2");
		shelf.enQueue("태백산맥 3");

		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
	}
}
