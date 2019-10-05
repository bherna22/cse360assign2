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
	
	/**
	 * Method Name: Adding Machine
	 * Description: Default constructor that initializes the internal
	 * value at zero, creates an 'AddingMachine' object
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Method Name: get total
	 * Description: returns the current internal value held
	 * current instance of the AddingMachine object
	 * @return total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Method Name: add
	 * Description: adds input value onto the stored internal
	 * value
	 * @param value - value that will be added onto total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Method Name: subtract
	 * Description: performs the arithmetic operation of subtraction
	 * by the input value onto the current internal value
	 * @param value - value that will be subtracted from total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Method Name: To String
	 * Description: Outputs a decription of what is contained in the current
	 * AddingMachine intance
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Method Name: Clear
	 * Description: clears the current AddingMachine instance, that is
	 * it resets internal value to zero
	 */
	public void clear() {
		
	}
}
