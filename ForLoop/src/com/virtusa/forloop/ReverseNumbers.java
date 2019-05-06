package com.virtusa.forloop;

public class ReverseNumbers {
	
	public static void main(String[] args) {
		
		int x=5698;
		int reverseNo=0;
		int reminder;
		
		while(x!=0)
		{
			reminder=x%10;
			reverseNo=(reverseNo*10)+ reminder;
			x=x/10;
		}
		System.out.println("Reverse No:"+ reverseNo);
	}
 
	
	
}
