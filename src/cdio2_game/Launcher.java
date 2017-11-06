/**
 * 
 */
package cdio2_game;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @author hedeg
 *
 */
public class Launcher {

	static ResourceBundle res; 
	public static void main(String[] args) {
		res = ResourceBundle.getBundle("localisation.MessagesBundle");
		System.out.println(res.getString("Tower"));

		int balance = 1000;
		String Name;
		// fix this pls
		Scanner sc = new Scanner(System.in);	
		System.out.println(res.getString("1stplayer"));
		Name = sc.nextLine();
		Player player1 = new Player(Name, balance);

		System.out.println(res.getString("2ndplayer"));
		Name = sc.nextLine();
		Player player2 = new Player(Name, balance);

		while(true) {


			System.out.println(res.getString("roll.dices"));
			Cup.rollCup();

			int eyes = Cup.getEyes(eyes);
			switch(eyes) {
			case 2:
				System.out.println(res.getString("FieldText2"));
				player1.addToBalance(250);
				break;
			case 3:
				System.out.println(res.getString("FieldText3"));
				player1.addToBalance(-100);
				break;
			case 4:
				System.out.println(res.getString("FieldText4"));
				player1.addToBalance(100);
				break;
			case 5:
				System.out.println(res.getString("FieldText5"));
				player1.addToBalance(-20);
				break;
			case 6:
				System.out.println(res.getString("FieldText6"));
				player1.addToBalance(180);
				break;
			case 7:
				System.out.println(res.getString("FieldText7"));
				break;
			case 8:
				System.out.println(res.getString("FieldText8"));
				player1.addToBalance(-70);
				break;
			case 9:
				System.out.println(res.getString("FieldText9"));
				player1.addToBalance(60);
				break;
			case 10:
				System.out.println(res.getString("FieldText10"));
				player1.addToBalance(-80);
				//Add extra turn feature!
				break;
			case 11:
				System.out.println(res.getString("FieldText11"));
				player1.addToBalance(-50);
				break;
			case 12:
				System.out.println(res.getString("FieldText12"));
				player1.addToBalance(650);
				break;	
			}
			if(player1.balance >= 3000) {
				System.out.println(res.getString("congrats"));
				System.out.println("");
				System.out.println(res.getString("thanks"));
				break;
			}
		}
		System.out.println(res.getString("roll.dices"));
		Cup.rollCup();

		int eyes = Cup.getEyes(eyes);
		switch(eyes) {
		case 2:
			System.out.println(res.getString("FieldText2"));
			player2.addToBalance(250);
			break;
		case 3:
			System.out.println(res.getString("FieldText3"));
			player2.addToBalance(-100);
			break;
		case 4:
			System.out.println(res.getString("FieldText4"));
			player2.addToBalance(100);
			break;
		case 5:
			System.out.println(res.getString("FieldText5"));
			player2.addToBalance(-20);
			break;
		case 6:
			System.out.println(res.getString("FieldText6"));
			player2.addToBalance(180);
			break;
		case 7:
			System.out.println(res.getString("FieldText7"));
			break;
		case 8:
			System.out.println(res.getString("FieldText8"));
			player2.addToBalance(-70);
			break;
		case 9:
			System.out.println(res.getString("FieldText9"));
			player2.addToBalance(60);
			break;
		case 10:
			System.out.println(res.getString("FieldText10"));
			player2.addToBalance(-80);
			//Add extra turn feature!
			break;
		case 11:
			System.out.println(res.getString("FieldText11"));
			player2.addToBalance(-50);
			break;
		case 12:
			System.out.println(res.getString("FieldText12"));
			player2.addToBalance(650);
			break;
		}
		if(player2.balance >= 3000) {
			System.out.println(res.getString("congrats"));
			System.out.println("");
			System.out.println(res.getString("thanks"));
			break;
		}
		

		sc.close();
	}
}
