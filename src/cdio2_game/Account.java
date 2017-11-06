package cdio2_game;

public class Account {
	int Balance, defaultBalance = 1000;

	/**
	 * Constructor
	 */

	// constructor, sÃ¦tter spillerens penge til startbelÃ¸bet som nÃ¦mt kan Ã¦ndres

	public Account() {
		this.Balance = defaultBalance;
		balanceCheck();

	}
	// retunere balancen i kontoen
	public int getBalance() {
		return Balance;
	}

	// setPenge tilfÃ¸jer en int vÃ¦rdi til spilleren penge, hvis slutvÃ¦rdien bliver
	// under 0 Ã¦ndres den til 0

	public void addBalance(int Balance) {
		this.Balance += Balance;
		balanceCheck();
	}

	// sÃ¦tter penge til 0 hvis den er under 0, kald denne metode efter alle
	// Ã¦ndringer i en spillers penge
	private void balanceCheck() {
		if (this.Balance < 0)
			this.Balance = 0;
	}

}