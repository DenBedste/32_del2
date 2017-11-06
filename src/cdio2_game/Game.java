package cdio2_game;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Game {

	private int[] fieldVal = new int[] {250, -100, 100,-20, 180, 0, -70, 60, -80, -50, 650};
	private ResourceBundle res;
	private Player[] player = new Player[2];
	private Scanner sc;
	private int i;
	private Cup cup;

	/**
	 *  
	 */
	private void playerRegistration() {
		for(int i=0;i<player.length;i++) {
			player[i].setName(System.out.println(res.getString("initPlayer") + " " + i +":"));
			
		}
	}

	private void playing() {
	}
	
	public void gameExecute() {
		sc = new Scanner(System.in);
		playerRegistration();
		
	}

	
}
