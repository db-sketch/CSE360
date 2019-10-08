/*
 * Name: Dawson Black (ASU ID: 1212509686)
 * Class ID: 70641
 * Description: This program uses several methods
 * to add and subtract integers from a total, which
 * initially starts at zero.
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
	
	/*
	 * This is the constructor method
	 */
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * This method returns the current total
	 */
	
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * This method will add the parameter value 
	 * to the total
	 */
	
	public void add (int value) 
	{
		
	}
	
	/*
	 * This method will subtract the parameter
	 * value from the total
	 */
	
	public void subtract (int value) 
	{
		
	}
	
	/*
	 * This method will print all of the changes
	 * made to the total
	 */
		
	public String toString () 
	{
		return "";
	}
	
	/*
	 * This method will reset the total to 0.
	 */

	public void clear() 
	{
	
	}
}
