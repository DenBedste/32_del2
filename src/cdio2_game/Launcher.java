/**
 * 
 */
package cdio2_game;

/**
 * @author hedeg
 *
 */
public class Launcher {
	static Game game;

	public static void main(String[] args) {
		game = new Game();
		game.gameExecute();
	}
}
