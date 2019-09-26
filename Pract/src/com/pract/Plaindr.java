package com.pract;

public class Plaindr {

	public static void isPalindromeNum(int num)
	{
		System.out.println("given num is" +num);
		int r=0;
		int sum=0;
		int t;
		t=num;
	
	while (num>0)
	{
		r=num%10;
		num=num/10;
		sum=(sum*10)+r;
	}
	
	if(t==sum){
		
		System.out.println("is palindrom");
	}
	else{
	
	
	System.out.println(" not palindrome");
	}
	}

	public static void main(String[] args) {
		isPalindromeNum(151);
		isPalindromeNum(78987);

	}

}
