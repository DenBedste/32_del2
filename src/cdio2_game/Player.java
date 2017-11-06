package cdio2_game;

public class Player {
	// Creating a String obj represents the player name
	private String name;
	// creating an int variable represents the player money account
	private Account account;

	/**
	 * 
	 * @param name
	 * @param balance
	 */
	// the constructor of the Class takes two parameters String name and int money
	public boolean winner() {
		if (account.getBalance() >= 3000)
			return true;
		else
			return false;
	}

	public Player() {
		account = new Account();
		name = "";

	}

	// returns the name of the player
	public String getName() {
		return name;
	}

	// returns the money the player has
	public int getBalance() {
		return account.getBalance();
	}

	// adds money to the player account
	public void addBalance(int value) {
		account.addBalance(value);
	}

	public void setName(String name) {
		this.name = name;
	}
}
