package cdio2_game;

public class Account {
	int balance, defaultBalance = 1000;

	/**
	 * Constructor
	 */

	// constructor, sÃ¦tter spillerens penge til startbelÃ¸bet som nÃ¦mt kan Ã¦ndres

	public Account(int balance) {
		this.balance = defaultBalance;
		balanceCheck();

	}
	// retunere balancen i kontoen
	public int getBalance() {
		return balance;
	}

	// setPenge tilfÃ¸jer en int vÃ¦rdi til spilleren penge, hvis slutvÃ¦rdien bliver
	// under 0 Ã¦ndres den til 0

	public void addToBalance(int Balance) {
		this.balance += balance;
		balanceCheck();
	}

	// sÃ¦tter penge til 0 hvis den er under 0, kald denne metode efter alle
	// Ã¦ndringer i en spillers penge
	private void balanceCheck() {
		if (this.balance < 0)
			this.balance = 0;
	}
	
	public String toString() {
		return  balance + "";

	}

}