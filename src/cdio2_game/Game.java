package cdio2_game;
/**
 * This class handles the game.
 * This includes:
 * Initinating a balance with a value. (Constructor).
 * Returning the balance (int).
 * Setting the balance to 0, if balance < 0. (void).
 * Adding/Subtracting from the balance (void).
 * 
 * Called from the class "Launcher".
 */

import java.util.ResourceBundle;
import java.util.Scanner;

public class Game {
	/**
	 * Initinates an int array for the gameboard, with the values being the amount of money the space is worth.
	 * Establises a ResourceBundle from the java.util.ResourceBundle. This makes it possible to load between different .properties files which contains the same Stringnames, but different text in the Strings.
	 * Initinates an int array for the players, which created the players and their account at the same time.
	 * Establises a Scanner from the java.util.Scanner. This makes it possible to register inputs from the user.
	 * Establises an int "i", which will be used to distinguish between the players.
	 * Establises a cup from the class "Cup", so it can be rolled.
	 */
	private int[] fieldVal = new int[] { 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650 };
	private ResourceBundle res;
	private Player[] player = new Player[2];
	private Scanner sc;
	private int i;
	private Cup cup;

	/**
	 *  Method that makes the game run.
	 *  Initinates the ResourceBundle "res" by setting it to a .properties files from the localisation folder.
	 *  Afterwards a welcome message is printed out. "res".getString("") means the string is from the .properties file.
	 *  Initinates the Scanner "sc" by allowing it to recieve inputs from the user.
	 *  The method playerRegistration() is run. Allows for the players to create their playername and account.
	 *  Initinates the cup.
	 *  The method Playing() is run. When this method is done, the game is over.
	 *  Initinates a String "end", so the player can enter exit to exit the game.
	 *  The while-loop closes the game while the "end" String becomes "exit"
	 */
	public void gameExecute() {
		res = ResourceBundle.getBundle("localisation.MessegesBundle");
		System.out.println(res.getString("welcomeMessege"));

		sc = new Scanner(System.in);
		playerRegistration();

		cup = new Cup();

		Playing();
		String end = "";
		System.out.println("Type \"exit\" to end the game");
		while (!end.equalsIgnoreCase("exit")) {
			end = sc.nextLine();
		}
		sc.close();

	}

	/**
	 * Method that creates the players and their account from the constructor of the "Player" class.
	 * A for-loop is run until the number of players is equal to the length of the player array.
	 * Everytime the loop loops a player is created, and the player can insert a name with the player.setName method.
	 */
	private void playerRegistration() {
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
			System.out.print(res.getString("player_init") + (1 + i) + ": ");
			player[i].setName(sc.nextLine());
		}
	}
	/**
	 * Initinates the int i to -1.
	 * A do-while-loop is run until a player has been declared the winner.
	 * 
	 */
	private void Playing() {
		i = -1;
		do {
			if (cup.getEyes(0) != 8) {
				i++;
				if (i > player.length - 1)
					i = 0;
			}
			System.out.println();
			System.out.println(player[i].getName() + " " + res.getString("init_roll"));
			sc.nextLine();
			cup.rollCup();
			System.out.println(player[i].getName() + " " + res.getString("rollPrint1") + " " + cup.getEyes(0) + " "
					+ res.getString("rollPrint2") + " " + cup.getEyes(1) + " " + res.getString("rollPrint3") + " "
					+ cup.getEyes(2) + " " + res.getString("rollPrint4") + " "
					+ res.getString("field" + cup.getEyes(0) + "name"));
			player[i].addBalance(fieldVal[cup.getEyes(0) - 2]);
			System.out.println(res.getString("field" + cup.getEyes(0) + "text"));
			if (fieldVal[cup.getEyes(0) - 2] > 0) {
				System.out.println(res.getString("balance_Change_Positive") + " " + fieldVal[cup.getEyes(0) - 2]);
			} else if (fieldVal[cup.getEyes(0) - 2] < 0) {
				System.out.println(
						res.getString("balance_Change_Negative") + " " + Math.abs(fieldVal[cup.getEyes(0) - 2]));
			} else {
				System.out.println(res.getString("balance_Change_none"));
			}
			if (fieldVal[cup.getEyes(0) - 2] != 0)
				System.out.println(player[i].getName() + res.getString("new_Balance") + " " + player[i].getBalance());
			if (player[i].getBalance() > 3000)
				break;

			if (i > player.length - 1)
				i = 0;
		} while (player[i].winner() == false || player[i].winner() == true);
		System.out.println(player[i].getName() + " " + res.getString("winMSG1") + " " + player[i].getBalance() + " "
				+ res.getString("winMSG2"));
	}


}
