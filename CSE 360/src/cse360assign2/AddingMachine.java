/*
 * Name: Dawson Black (ASU ID: 1212509686)
 * Class ID: 70641
 * Description: This program uses several methods
 * to add and subtract integers from a total, which
 * initially starts at zero. Also, this program keeps
 * track of each operation made to the total.
 */

package cse360assign2;

/*
 * This class, AddingMachine, use the methods
 * add and subtract to add and subtract integers
 * from a total. This class can also keep track
 * off all the changes made to the total in the 
 * toString. In addition, it can clear the total
 * using the clear method.
 */

public class AddingMachine 
{

	private int total;
	private String history;
	
	/*
	 * This is the constructor method. 
	 * Also resets the history of operations.
	 */
	
	public AddingMachine () 
	{
		history = "0";
	}
	
	/*
	 * This method returns the current total.
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * This method will add the parameter value 
	 * to the total, and add the operation to 
	 * the history.
	 */
	
	public void add (int value) 
	{
		total += value;
		
		history += " + " + value;
	}
	
	/*
	 * This method will subtract the parameter
	 * value from the total, and add the operation
	 * to the history
	 */
	
	public void subtract (int value) 
	{
		total -= value;
		
		history += " - " + value;
	}
	
	/*
	 * This method will print all of the operations
	 * done to the total
	 */
		
	public String toString () 
	{
		return history;
	}
	
	/*
	 * This method will reset the total to 0 and 
	 * reset the history to 0.
	 */

	public void clear() 
	{
		total = 0;
		history = "0";
	}
}
