package com.pract;

public class Armstrong {
	public static void isArmstrong(int num)
	
	
	{
		System.out.println("given num is"+num);
		
		int r;
		int cube=0;
		int t;
		t=num;
		while (num>0) 
		{
			r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
		
		}
		if(t==cube)
		{	
		
			System.out.println("this an  armstrong:");
		}
		else{
			
		
		System.out.println("this is not armstrong:");}
			
		
	}
		

	public static void main(String[] args) 
	{ isArmstrong(153);
	isArmstrong(370);
	isArmstrong(1);
	isArmstrong(0);
	isArmstrong(234);
		// TODO Auto-generated method stub

	}

}
