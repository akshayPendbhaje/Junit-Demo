package com.simsr.test;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticOperations ao=new ArithmeticOperations();
		
		System.out.println(ao.add(2, 3));
	}
	
	
	  public int add(int a, int b) { return a+b; }
	  

	  public int sub(int a, int b) { return a-b; }
	  

	  public int divide(int a, int b) { return a-b; }
	 
	
	public boolean isEven(int n)
	{
		if(n%2==0)
			return true;
		else 
			return false;
		
	}

}
