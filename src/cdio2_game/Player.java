package cdio2_game;

public class Player extends Account {
	
	String playerName;
	
	/**
	 * 
	 */
	public Player (String name) {
		playerName = name;
	}
	
	/**
	 * 
	 */
	public String getName() {
		return playerName;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return  playerName + "\t\t" + Balance + ".";
	}
}