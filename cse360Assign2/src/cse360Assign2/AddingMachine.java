package cse360Assign2;

public class AddingMachine {
	
	private int total;
	private String operations; // record the observations/operations implemented
	
	public AddingMachine () // initializing method
	{
		total = 0;
		operations = "0";
	}
	public int getTotal () // returns total
	{
		return total;
	}
	public void add (int value) // adds the parameter to the total
	{
		total += value;
		operations = operations + " + " + value;
	}
	public void subtract (int value) // subtracts the parameter from the total
	{
		total -= value;
		operations = operations + " - " + value;
	}
	public String toString () // returns the string with all the operations
	{
		return operations;
	}
	public void clear() // resets the variables
	{
		total = 0 ;
		operations = " 0 ";
	}

}
