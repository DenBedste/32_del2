/**
 * 
 */

/**
 * @author Stonecore
 *
 */
public class Konto {
	int penge, startBeløb = 1000;

	/**
	 * @param args
	 */
	// constructor, sætter spillerens penge til startbeløbet som næmt kan ændres

	public Konto() {
		penge = startBeløb;
		// TODO Auto-generated method stub

	}
	// setPenge tilføjer en int værdi til spilleren penge, hvis slutværdien bliver
	// under 0 ændres den til 0

	public void setPenge(int penge) {
		if (pengeCheck(penge, this.penge))
			this.penge += penge;
		else
			this.penge = 0;

	}

	private boolean pengeCheck(int pænge, int nytBeløb) {
		return pænge + nytBeløb > 0;
	}

}
