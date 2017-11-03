package cdio2_game;

import java.util.Random;

public class Cup {
	private Random rand1, rand2;
	private int diceface1, diceface2; 

	//	constructor of the class Terninger
	public Cup(){
		rand1 = new Random();
		rand2 = new Random();
		roll();
	}

	// roll the die and return the value (1-6)
	public void roll() {
		diceface1 = rand1.nextInt(6)+1;
		diceface2 = rand2.nextInt(6)+1;

	}
	public int getSum() {
		return diceface1 + diceface2;
	}
	public boolean getEns() {
		return diceface1 == diceface2;
	}

	public int getDiceface1() {
		return diceface1;
	}

	public int getDiceface2() {
		return diceface2;
	}

	public void setDice(int diceface1, int diceface2){
		this.diceface1 = diceface1;
		this.diceface2 = diceface2;
	}
}
