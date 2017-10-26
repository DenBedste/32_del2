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
		pengeCheck();
		// TODO Auto-generated method stub

	}
	// setPenge tilføjer en int værdi til spilleren penge, hvis slutværdien bliver
	// under 0 ændres den til 0

	public void setPenge(int penge) {

		this.penge += penge;
		pengeCheck();

	}

	// sætter penge til 0 hvis den er under 0, kald denne metode efter alle
	// ændringer i en spillers penge
	private void pengeCheck() {
		if (this.penge < 0)
			this.penge = 0;
	}

}
