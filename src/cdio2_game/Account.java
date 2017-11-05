package cdio2_game;

public class Account {
	int Balance, defaultBalance = 1000;

	/**
	 * Constructor
	 */
	public Account() {
		Balance = defaultBalance;
	}

	/**
	 * make sure the balance is not negative
	 */
	private void balanceCheck() {
		if (Balance < 0)
			Balance = 0;
	}
	
	/**
	 * @param value
	 */
	public void addBalance(int value) {
		Balance += value;
		balanceCheck();
	}

	/**
	 * 
	 */
	public int getBalance() {
		return Balance;
	}

}