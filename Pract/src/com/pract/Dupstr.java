package com.pract;

import java.util.Arrays;

public class Dupstr {

	public static void main(String[] args) {
		String str="bbccaaddffeert";
		int cnt=0;
		char inp[]=str.toCharArray();
		System.out.println("duplicate characters in a given string:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(inp[i]==inp[j])
				{
					System.out.print(inp[j]);
					cnt++;
					
		}}}System.out.println(cnt);
		Arrays.sort(inp);
		System.out.println(String.valueOf(inp));
			}
		}

	

