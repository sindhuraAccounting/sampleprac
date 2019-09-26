package com.pract;

public class Revofint {

	public static void main(String[] args) {
	int num=123489567;
		int rem;
		int res=0;
		
while (num>0) {
	rem=num%10;
	num=num/10;
	res=res*10+rem;
	
}System.out.println(res);
	}

}
