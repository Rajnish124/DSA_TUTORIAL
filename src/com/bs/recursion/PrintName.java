package com.bs.recursion;

public class PrintName {
	//Print N times Name using recursion
	static int count=0;
	public static void printName(int N) {
		
		if(count==N) {
			return;
		}
		count++;
		System.out.println("Rajnish Kumar");
		printName(N);
	}
	
	public static void displayName(int i,int n) {
		
		if(i>n) {
			return;
		}
		System.out.println("Sunil Ji");
		displayName(i+1, n);
		
	}
	
	//Print 1 to N times a Number
	
	public static void printNumber(int i,int n) {
		
		if(i>n) {
			return;
		}
		System.out.print(i+" ");
		printNumber(i+1, n);
	}
	
	//Print numbers from N to 1 in reverse order
	
	public static void printReverseNumber(int i,int n) {
		if(n<1) {
			return;
				
		}
		System.out.print(n+" ");
		printReverseNumber(i, n-1);
		
		
	}
	
	//print sum of first N numbers
	public static int sum=0;
	public static void sumOfFirstNnumbers(int i,int n) {
		
		
		if(i>n) {
			return;
		}
		
		sum=sum+i;
		sumOfFirstNnumbers(i+1, n);
		
	}
	
	//print factorial of a number
	
	public static int fact=1;
	public static void factorial(int n) {
		
		if(n<1) {
			return;
		}
		fact=fact*(n);
		factorial(n-1);
		
	}
	
	//print array
	
	public static void printArray(int[] array,int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	//reverse an array
	
	public static void reverseArray(int[] arr, int i, int n) {
		
		if(i<n) {
		int temp=arr[i];
		arr[i]=arr[n];
		arr[n]=temp;
		reverseArray(arr, i+1, n-1);
		
	}
	}
	
	//print 1 to N using Backtracking
	
	public static void printUsingBacktracking(int i,int n) {
		
		if(i<1) {
			return;
		}
		printUsingBacktracking(i-1, n);
		System.out.print(i+" ");
	}
	
	//print N to 1 using Backtracking
	
	public static void Nto1UsingBackTracking(int i,int n) {
		if(i>n) {
			return;
		}
		
		Nto1UsingBackTracking(i+1, n);
		System.out.print(i+" ");
	
	}
	
	public static void main(String[] args) {
		PrintName.printName(5);
		PrintName.displayName(1, 3);
		PrintName.printNumber(1, 3);
		System.out.println();
		PrintName.printReverseNumber(1, 3);
		PrintName.sumOfFirstNnumbers(1, 5);
		System.out.println();
		System.out.println(sum);
		PrintName.factorial(5);
		System.out.println("Factorial of"+" "+5+" is"+" "+fact);
		int[] arr= {1,2,3,4,5};
		PrintName.reverseArray(arr,0,arr.length-1);
		System.out.println();
		PrintName.printArray(arr,5);
		PrintName.printUsingBacktracking(3, 3);
		System.out.println();
		PrintName.Nto1UsingBackTracking(1, 3);
		
	}

}
