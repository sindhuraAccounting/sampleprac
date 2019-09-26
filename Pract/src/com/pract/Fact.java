package com.pract;

public class Fact {

	public static int factorial(int num)
	{
		int fact=1;
		for (int i = 0; i <=num; i++)
		{
			fact=fact*i;
			
		}
		return fact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(4));
	}

}
