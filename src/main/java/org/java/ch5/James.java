package org.java.ch5;

public class James {
	int age;
	String name;
	boolean married;
	int countOfChild;

	James(int age, String name, boolean married, int countOfChild) {
		this.age = age;
		this.name = name;
		this.married = married;
		this.countOfChild = countOfChild;
	}

	@Override
	public String toString() {
		return "James [age=" + age + ", name=" + name + ", married=" + married + ", countOfChild=" + countOfChild + "]";
	}
}
