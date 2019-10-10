package cse360Assign2;

public class AddingMachine {
	
	private int total;
	private String operations;
	// not needed - included for clarity
	public AddingMachine () 
	{
		total = 0;
		operations = "0";
	}
	public int getTotal () 
	{
		return total;
	}
	public void add (int value) 
	{
		total += value;
		operations = operations + " + " + value;
	}
	public void subtract (int value) 
	{
		total -= value;
		operations = operations + " - " + value;
	}
	public String toString () 
	{
		return operations;
	}
	public void clear() 
	{
		total = 0 ;
		operations = " 0 ";
	}

}
