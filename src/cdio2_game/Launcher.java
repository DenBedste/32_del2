package cdio2_game;

/**
 * This class handles launching of the game.
 * This includes:
 * Establising a game and making it static.
 * Running the game.
 * 
 * Contains "Public static void main(String[] args)"
 */

public class Launcher {
	static Game game;

	public static void main(String[] args) {
		game = new Game();
		game.gameExecute();
	}
}
