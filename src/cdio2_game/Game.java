package cdio2_game;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Game {
	private int[] fieldVal = new int[] { 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650 };
	private ResourceBundle res;
	private Player[] player = new Player[2];
	private Scanner sc;
	private int i;
	private Cup cup;

	/**
	 *  
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

	
	private void playerRegistration() {
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
			System.out.print(res.getString("player_init") + (1 + i) + ": ");
			player[i].setName(sc.nextLine());
		}
	}

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
