package org.java.ch9.template.game;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프할 줄 모름");
	}

	@Override
	public void turn() {
		System.out.println("턴을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자이다.");
	}
}
