package cdio2_game;


public class Player {
// Creating a String obj represents the player name
		private String name;
		// creating an int variable represents the player money account
		private Account playerAccount;
/**
 * 
 * @param name
 * @param balance
 */
		// the constructor of the Class takes two parameters String name and int money
		public Player() {
playerAccount = new Account();


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
		public void addBalance(int dbalance) {
			balance += dbalance;
		}

		// returns a String represents the player
		public String toString() {
			return name + "\t" + playerAccount + ".";
		}

		public void setName(Object println) {
			// TODO Auto-generated method stub
			
		}
	}



