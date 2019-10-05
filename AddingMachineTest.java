package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	/**
	 * tests the constructor
	 */
	@Test
	void constructorTest() {
		
		AddingMachine test = new AddingMachine();
		assertNotNull( test );
		
	}
	
	/**
	 * tests the add method
	 */
	@Test
	void addTest() {
		
		AddingMachine test = new AddingMachine();
		test.add( 108 );
		assertEquals( test.getTotal(), 108 );
		
	}
	
	/**
	 * tests the subtract method
	 */
	@Test
	void subtractTest() {
		
		AddingMachine test = new AddingMachine();
		test.subtract( 108 );
		assertEquals( test.getTotal(), -108 );
		
	}
	
	/**
	 * test clear method
	 */
	@Test
	void clearTest() {
		AddingMachine test = new AddingMachine( 10 );
		test.clear();
		assertEquals( test.getTotal(), 0 );
	}

}
