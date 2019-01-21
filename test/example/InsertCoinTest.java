package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertCoinTest {
	
	VendingMachine machine = new VendingMachine();
	
	@Test(expected = IllegalStateException.class)
	public void TestCoinAlreadyInserted() {
		int first_fill = machine.fill(10);
		boolean coin_state = machine.insertCoin();
		boolean coin_state_second = machine.insertCoin();
	}
	
	@Test
	public void TestZeroStock() {
		boolean coin_state = machine.insertCoin();
		assertEquals(coin_state, false);
	}
	
	@Test
	public void TestSuccessfulInsert() {
		int first_fill = machine.fill(10);
		boolean coin_state = machine.insertCoin();
		assertEquals(coin_state, true);
	}

}
