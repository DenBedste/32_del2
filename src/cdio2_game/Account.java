package cdio2_game;

public class Account {
	/**
	 * Initiates a balance and makes a default value;
	 */
	int Balance, defaultBalance = 1000;

	/**
	 * Constructor
	 * The default value is made into the (Account) Balance. and a balancecheck (line 24-25) is made.
	 */

	public Account() {
		Balance = defaultBalance;
		balanceCheck();
	}

	/**
	 * Method that returns the current balance.
	 */
	public int getBalance() {
		return Balance;
	}

	/**
	 * Method that checks if the balance is under 0.
	 * If the balance is under 0, the balance is set to 0, due to the requirements of the game.
	 */
	private void balanceCheck() {
		if (this.Balance < 0)
			this.Balance = 0;
	}
	
	/**
	 * Method that add a value to the balance to the current balance
	 * Afterwards a balancecheck (line 24-25) is made.
	 */
	public void addBalance(int Balance) {
		this.Balance += Balance;
		balanceCheck();
	}
}