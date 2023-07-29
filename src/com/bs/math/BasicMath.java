package com.bs.math;



public class BasicMath {

	public static void main(String[] args) {
		
		BasicMath.extract(7789);
		
	
}
	
	public static void extract(int N) {
		int lastDigit;
		
		while(N>0) {
			
			lastDigit=N%10;
			System.out.print(lastDigit+" ");
			N=N/10;
		}
		
	}
}