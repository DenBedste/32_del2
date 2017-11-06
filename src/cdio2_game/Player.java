package cdio2_game;


public class Player {
// Creating a String obj represents the player name
		private String name;
		// creating an int variable represents the player money account
		private Account playerAccount;
		public int balance;
/**
 * 
 * @param name
 * @param balance
 */
		// the constructor of the Class takes two parameters String name and int money
		public Player(String name, int balance) {
			// setting the name of the player
			this.name = name;
			// setting the money of the player
			this.playerAccount = new Account(balance);
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



