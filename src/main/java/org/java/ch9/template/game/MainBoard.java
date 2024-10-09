package org.java.ch9.template.game;

public class MainBoard {
	public static void main(String[] args) {
		Player play = new Player();
		play.play(1);

		AdvancedLevel advancedLevel = new AdvancedLevel();
		play.upgradeLevel(advancedLevel);
		play.play(2);

		SuperLevel superLevel = new SuperLevel();
		play.upgradeLevel(superLevel);
		play.play(3);
	}
}
