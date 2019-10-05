package cse360assign2;
/**
 * @author: Brandon Hernandez
 * Class ID: 85141
 * Class: CSE360
 * Assignment #: 2
 * Contents: Contains AddingMachine class
 * Description: An adding machine that does several arithmetical
 * operations and maintains an internal initialized value
 */

public class AddingMachine {
	
	private int total; // private internal value
	private String log; // logs all the changes to the total value
	
	/**
	 * Method Name: Adding Machine
	 * Description: Default constructor that initializes the internal
	 * value at zero, creates an 'AddingMachine' object
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		log = "" + total;
	}
	
	/**
	 * Method Name: Adding Machine 
	 * Description: Overloaded constructor takes a value and initializes
	 * the internal value at this input
	 * @param value - value that will be input into total 
	 */
	public AddingMachine( int value ) {
		total = value;
		log = "" + total;
	}
	
	/**
	 * Method Name: get total
	 * Description: returns the current internal value held
	 * current instance of the AddingMachine object
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method Name: add
	 * Description: adds input value onto the stored internal
	 * value
	 * @param value - value that will be added onto total
	 */
	public void add (int value) {
		total += value;
		log += " + " + value;
	}
	
	/**
	 * Method Name: subtract
	 * Description: performs the arithmetic operation of subtraction
	 * by the input value onto the current internal value
	 * @param value - value that will be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		log += " - " + value;
	}
	
	/**
	 * Method Name: To String
	 * Description: Outputs a decription of what is contained in the current
	 * AddingMachine intance
	 */
	public String toString () {
		return total + " = " + log;
	}
	
	/**
	 * Method Name: Clear
	 * Description: clears the current AddingMachine instance, that is
	 * it resets internal value to zero, and clears the log as well
	 */
	public void clear() {
		total = 0;
		log = "0";
	}
}
