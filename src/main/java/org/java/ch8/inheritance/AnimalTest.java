package org.java.ch8.inheritance;

import java.util.ArrayList;

class Animal{
	public void move(){
		System.out.println("동물이 움직입");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void read(){
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move(){
		System.out.println("호랑이가 움직인다.");
	}
	public void hunting(){
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move(){
		System.out.println("독수리이가 움직인다.");
	}
	public void flying(){
		System.out.println("독수리가가 날아 다닙니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal> animals = new ArrayList<>();
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}

	private void testCasting() {
		for (Animal ani : animals) {
			if (ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
				continue;
			}
			if (ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
				continue;
			}
			if (ani instanceof Human) {
				Human human = (Human)ani;
				human.read();
				continue;
			}
			System.out.println("지원되지 않는 형식입니다.");
		}
	}

	private void addAnimal() {
		animals.add(new Tiger());
		animals.add(new Eagle());
		animals.add(new Human());

		for(Animal animal : animals) {
			animal.move();
		}
	}
}
