package org.java.ch9.template.game;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴을 못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자이다.");
	}
}
