package com.bs.math;

public class ReverseNumber {

	public static void reverseNumbe(int N) {
		int lastDigit;
		int reverseNumber=0;
		while(N>0) {
			lastDigit=N%10;
			reverseNumber=reverseNumber*10+lastDigit;
			N=N/10;
		}
		System.out.println(reverseNumber);
	}
	
	public static void main(String[] args) {
		ReverseNumber.reverseNumbe(7789);
		
	}
	
}
