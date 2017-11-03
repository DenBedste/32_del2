package cdio2_game;

import java.util.Random;

public class Dice {
	// creating two objects of type Random represents the two dices
	private Random rand;
	// creating two int variables to hold the last face value of the dices
	private int diceFace;
	// creating an int variable represents the max value of each dice
	private int max;

	// the Class constructor
	public Dice(int max) {
		// setting the max value
		this.max = max;
		// initializing the Random object
		rand = new Random();
		// initialize the face value to one
		diceFace = 1;
	}

	// rolls the dices bye generating a random number between 1-max
	// and saving the value in the face value instance data
	public void roll() {
		diceFace = rand.nextInt(max) + 1;
	}

	// returns the dice face value
	public int getDiceFace() {
		return diceFace;
	}


	// sets the max value of the dice
	public void setMax(int max) {
		this.max = max;
	}

	// returns the string that represents the Dice value
	public String toString() {
		return diceFace + "";
	}
}
