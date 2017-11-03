package cdio2_game;

public class Cup {
	// creating two objects of type Random represents the two dices
	private Dice dice1,dice2;

	// the Class constructor
	public Cup(int max) {
		// initializing the dices value
		dice1 = new Dice(max);
		dice2 = new Dice(max);
	}

	// rolls the dices and return the sum of the two faces
	public void roll() {
		dice1.roll();
		dice2.roll();
	}

	// returns the first dice face value
	public int get1stDiceFace() {
		return dice1.getDiceFace();
	}

	// returns the second dice face value
	public int get2ndDiceFace() {
		return dice2.getDiceFace();
	}

	// returns the Sum of the two dice faces value
	public int getDicesSum() {
		return dice1.getDiceFace() + dice2.getDiceFace();
	}

	// sets the max value of the dices
	public void setMax(int max) {
		dice1.setMax(max);
		dice2.setMax(max);
	}

	// returns the string that represents the Dices values
	public String toString() {
		return "( " + dice1.getDiceFace() + " + " + dice2.getDiceFace() + " ) = " + getDicesSum() + ".";
	}
}


