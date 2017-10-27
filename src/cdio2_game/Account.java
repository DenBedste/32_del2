package cdio2_game;
/**
 * 
 */

/**
 * @author Stonecore
 *
 */
public class Account {
	int Balance, defaultBalance = 1000;

	/**
	 * @param args
	 */
	// constructor, sætter spillerens penge til startbeløbet som næmt kan ændres

	public Account() {
		Balance = defaultBalance;
		balanceCheck();
		// TODO Auto-generated method stub

	}
	// setPenge tilføjer en int værdi til spilleren penge, hvis slutværdien bliver
	// under 0 ændres den til 0

	public void addBalance(int penge) {

		this.Balance += Balance;
		balanceCheck();

	}

	// sætter penge til 0 hvis den er under 0, kald denne metode efter alle
	// ændringer i en spillers penge
	private void balanceCheck() {
		if (this.Balance < 0)
			this.Balance = 0;
	}

}
