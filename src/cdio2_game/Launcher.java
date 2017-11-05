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

		Player player1, player2;
		Account account1;
		Account account2;
		String Name;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter name of first user");
		Name = sc.nextLine();
		account1 = new Account(1000);
		player1 = new Player(Name, account1);
		
		System.out.println("Enter name of the second user");
		Name = sc.nextLine();
		account2 = new Account(1000);
		player2 = new Player(Name, account2);



		sc.close();
	}
}
