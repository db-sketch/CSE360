/*
 * Name: Dawson Black (ASU ID: 1212509686)
 * Class ID: 70641
 * Description: A sample test case that
 * was in the Assignment 2 Document
 */

package cse360assign2;

public class AddingMachineTest 
{
	public static void main( String [] args )
	{
		AddingMachine myCalc = new AddingMachine();
		
		myCalc.add(4);
		myCalc.subtract(2);
		myCalc.add(5);
		System.out.println(myCalc.getTotal());
		
		System.out.println(myCalc.toString());
	}

}
