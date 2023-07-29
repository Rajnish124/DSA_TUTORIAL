package com.bs.recursion;

public class BasicRecursion {
	
	static int  count=0;
	
	public static void print() {
		
		if(count==3) {
			return;
			
		}
		System.out.println(count);
		count++;
		print();
	}
	
	public static void main(String[] args) {
		BasicRecursion.print();
	}

}
