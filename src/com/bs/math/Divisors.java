package com.bs.math;

public class Divisors {
	//TimeComplexity is O(n)
	public static void printDivisors(int N) {
		
		for(int i=1;i<=N;i++) {
			
			if(N%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Divisors.printDivisors(36);
		
	}

}
