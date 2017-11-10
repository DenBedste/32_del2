package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cdio2_game.Account;

public class TestBalance {
	Account test;

	@Before
	public void setUp() throws Exception {
		test = new Account();
	}

	@Test
	public void balancetest() {
		// the balance using the addBalance method
		test.addBalance(-1100);
		// getting the balance value of object test
		int balance = test.getBalance();
		// checking if the balance is correct
		assertEquals(balance, 0);
	}
}


