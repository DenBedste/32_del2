package cdio2_game;

public class Account {
	int Balance, defaultBalance = 1000;

	/**
	 * 
	 */
	public Account() {
		Balance = defaultBalance;
	}

	/**
	 * sætter penge til 0 hvis den er under 0, kald denne metode efter alle
	 * ændringer i en spillers penge
	 */
	private void balanceCheck() {
		if (Balance < 0)
			Balance = 0;
	}
	
	/**
	 * setPenge tilføjer en int værdi til spilleren penge, hvis slutværdien bliver
	 * under 0 ændres den til 0
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