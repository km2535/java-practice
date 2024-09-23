package org.java.ch7;

public class BookArray {
	public static void main(String[] args) {
		Book[] books = new Book[5];

		books[0] = new Book("태백산맥", "조정래");
		books[1] = new Book("데미안", "헤르만");
		books[2] = new Book("어떻게 살래?", "박경리");
		books[3] = new Book("토지", "유유유");
		books[4] = new Book("경매", "생태진");
		for(Book book : books){
			book.showBookInfo();
		}
	}
}
