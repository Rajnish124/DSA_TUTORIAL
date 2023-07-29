package com.bs.recursion;

public class Fibonacci {
	
	public static int n1=0,n2=1,n3;
	
	
	
	//print first 5 fibonacci number without using recursion
	public static void printFibonacci(int n) {
		
	System.out.print(n1+" "+n2+" ");
	for(int i=0;i<n-2;i++) {
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
	}
	
	
	}
	
	//using recursion
	public static int count=0;
	public static void printUsingRecursion(int n1,int n2,int i) {
		if(count==0) {
			System.out.print(n1+" "+n2+" ");
			count++;
		}
		
		if(i<1) {
			return;
		}
		n3=n1+n2;
		System.out.print(n3+" ");
		printUsingRecursion(n1=n2, n2=n3, i-1);
		
	
	}
	
	public static void main(String[] args) {
		//Fibonacci.printFibonacci(10);
		Fibonacci.printUsingRecursion(0,1,10);
		
	}

}
