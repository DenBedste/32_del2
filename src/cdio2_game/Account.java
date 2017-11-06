package cdio2_game;

public class Account {
	
	// creating an instance variables
	int Balance, defaultBalance = 1000;

	// the constructor of the Class 
	public Account() {
		Balance = defaultBalance;
		balanceCheck();

	}

	// returns the money in the account
	public int getBalance() {
		return Balance;
	}

	
	public void addBalance(int Balance) {
		this.Balance += Balance;
		balanceCheck();
	}

	// if the money became negative return it to zero
	private void balanceCheck() {
		if (this.Balance < 0)
			this.Balance = 0;
	}

}
