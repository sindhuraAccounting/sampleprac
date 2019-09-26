package com.pract;

import java.util.HashSet;
import java.util.Set;

public class dupelements {

	public static void main(String[] args) {
	int i[]=new int[]{1,2,3,4,7,}; 
	int j[]=new int[]{1,2,4,5};
	System.out.println("duplicate elements in an array");
	
Set<Integer>set=new HashSet<Integer>();

	for (int s = 0; s < i.length; s++) {
		for (int t = 0; t< j.length; t++)
		{
			if(i[s]==j[t])
			
					System.out.println(i[s]);
		}
		
		}
	
	}}
	


