package org.java.ch7;

public class ObjectCopy1 {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		Book[] books2 = new Book[3];

		books[0] = new Book("태백산맥", "조정래");
		books[1] = new Book("데미안", "헤르만");
		books[2] = new Book("어떻게 살래?", "박경리");

		System.arraycopy(books, 0, books2, 0, 3);
		for(Book book : books2) {
			book.showBookInfo();
		}

		books[0].setBookName("나목");
		books[0].setAuthor("박씨");

		System.out.println("===books====");
		for(Book book : books) {
			book.showBookInfo();
		}

		System.out.println("===books2====");
		for(Book book : books2) {
			book.showBookInfo();
		}
	}
}
