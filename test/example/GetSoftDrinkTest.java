package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetSoftDrinkTest {

	@Test
	public void TestForNoCoinInsertion() {
		VendingMachine machine = new VendingMachine(10);
		boolean soft_drink_state = machine.getSoftdrink();
		assertEquals(soft_drink_state, false);
	}
	
	@Test
	public void TestForSoftDrinkReception() {
		VendingMachine machine = new VendingMachine(10);
		boolean coin_inserted = machine.insertCoin();
		boolean soft_drink_state = machine.getSoftdrink();
		assertEquals(soft_drink_state, true);
	}
	
	public void TestIfCoinStateReversed() {
		VendingMachine machine = new VendingMachine(10);
		boolean coin_inserted = machine.insertCoin();
		boolean soft_drink_state = machine.getSoftdrink();
		assertEquals(machine.hasCoin, false);
	}
	
	public void TestForStockDecrease() {
		VendingMachine machine = new VendingMachine(10);
		boolean coin_inserted = machine.insertCoin();
		int previous_stock = machine.stock;
		boolean soft_drink_state = machine.getSoftdrink();
		assertEquals(machine.stock, previous_stock-1);
	}

}
