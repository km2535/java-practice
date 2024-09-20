package org.java.ch6;

class Person{
	String name;
	int age;

	public Person(){
		this("이름없음", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person returnItSelf(){
		return this;
	}
}


public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);

	}
}
