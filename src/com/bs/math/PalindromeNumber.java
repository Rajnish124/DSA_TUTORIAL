package com.bs.math;

public class PalindromeNumber {

	//If Reverse of any number is same with original one then it is called palindrome Number 
	//for example 121,131 etc.
	public static void checkPalindome(int N) {
		int lastDigit;
		int duplicate=N;
		int reverseNumber=0;
		while(N>0) {
			lastDigit=N%10;
			reverseNumber=reverseNumber*10+lastDigit;
			N=N/10;
		}
		
		if(duplicate==reverseNumber) {
			System.out.println(duplicate+" "+"is palindromeNumber");
		}
		else {
			System.out.println(duplicate+" "+"is not palindromeNumber");
		}
	}
	public static void main(String[] args) {
		PalindromeNumber.checkPalindome(131);
		
	}
	
	
}
