package com.bs.math;

public class CountDigit {
	
	public static void countDigit(int N) {
		int lastDigit;
		int count=0;
		
		while(N>0) {
			
			lastDigit=N%10;
			count++;
			N=N/10;
		}
		
		System.out.println("No of digits available in Number is:"+" "+ count);
		
	}
	
	
	public static void main(String[] args) {
		CountDigit.countDigit(136);
	}
}
