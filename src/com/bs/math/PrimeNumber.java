package com.bs.math;

public class PrimeNumber {
	
	public static void checkPrimeNumber(int N) {
		int count=0;
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(N+" "+ "is a Prime Number");
		}
		else {
			System.out.println(N+" "+"is not a Prime Number");
		}
		
	}
	
	public static void main(String[] args) {
		PrimeNumber.checkPrimeNumber(10);
		
	}

}
