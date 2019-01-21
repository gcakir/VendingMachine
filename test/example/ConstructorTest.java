package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructorTest {

	@Test(expected = IllegalArgumentException.class)
	public void TestInitializeWithNegativeInt() {
		VendingMachine machine = new VendingMachine(-10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestInitializeWithTooBigInt() {
		VendingMachine machine = new VendingMachine(1000);
	}
	
	@Test
	public void TestIfStockSet() {
		VendingMachine machine = new VendingMachine(10);
		assertEquals(machine.stock, 10);
	}
	
	@Test
	public void TestIfCoinStateSet() {
		VendingMachine machine = new VendingMachine(10);
		assertEquals(machine.hasCoin, false);
	}

}
