package com.pract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dupofint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{1,2,6,6,3,4,7,4,}; 
		
		System.out.println("duplicate elements in an array");
		


		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j< arr.length; j++)
			{
				if(arr[i]==arr[j])
				
						System.out.print(arr[i]);
				
			}
			System.out.println();
			}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
