/**
 * 
 */
package cdio2_game;

import java.util.ResourceBundle;

/**
 * @author hedeg
 *
 */
public class Launcher {
	static ResourceBundle res; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		res = ResourceBundle.getBundle("localisation.MessagesBundle");
		System.out.println(res.getString("Tower"));
	}

}
