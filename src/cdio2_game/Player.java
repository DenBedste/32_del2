package cdio2_game;

public class Player extends Account {

  String playerName;
  
  //Constructor
  public Player (String name, int playerAccount) {
    name = playerName;
    playerAccount = Balance;
  }
  // returns the name of the player
	public String getName() {
		return name;
	}

	// returns the money the player has
	public int getBalance() {
		return playerAccount.getBalance();
	}

	// adds money to the player account
	public void addToBalance(int dbalance) {
		this.playerAccount.addToBalance(dbalance);
	}

	// returns a String represents the player
	public String toString() {
		return name + "\t" + playerAccount + ".";
	}
}

  
}
