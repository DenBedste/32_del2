package cdio2_game;

import java.util.Random;

public class Cup {
	private int[] eyes = new int[3];
	private Random dice1,dice2;
	private int sides;
	
	/**
	 * 
	 * @param sides
	 */
	public Cup(int sides){
		this.sides = sides;
		dice1 = new Random();
		dice2 = new Random();
	}

	/**
	 * 
	 * @return
	 */
	public int rollCup() {
		rollDices();
		eyes[2] = eyes[0] + eyes[1];
		return eyes[2];
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public int getEyes(int number) {
		return eyes[number];
	}

	/**
	 * 
	 */
	private void rollDices() {
		eyes[0] = dice1.nextInt(sides) + 1;
		eyes[1] = dice2.nextInt(sides) + 1;
	}

	/**
	 * 
	 */
	public String toString() {
		return "( " + eyes[0] + " + " + eyes[1] + " ) = " + eyes[2] + ".";
	}
}