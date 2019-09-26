package com.pract;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class reversestring {

	public static void main(String[] args)
	{
	String orginal="selinium",reverse="";
	for (int i = orginal.length()-1; i>=0; i--) 
	{
		reverse=reverse+orginal.charAt(i);
	}
System.out.println(reverse);
	}

}
