package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FillTest {

	VendingMachine machine = new VendingMachine();
	
	@Test(expected = IllegalStateException.class)
	public void TestNoRefillAllowed() {
		// boolean coin_state = machine.insertCoin();
		int first_fill = machine.fill(10);
		boolean coin_state = machine.insertCoin();
		int second_fill = machine.fill(5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestRefillWithNegativeNumber() {
		int first_fill = machine.fill(-10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestOvercapacity() {
		int first_fill = machine.fill(1000);
	}

}
