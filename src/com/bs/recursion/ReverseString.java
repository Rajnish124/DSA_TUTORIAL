package com.bs.recursion;

public class ReverseString {
	
	//using basic for loop
	
	public static void reverseString(String name) {
		String reverse=" ";
		Character ch;
		for(int i=name.length()-1;i>=0;i--) {
			ch=name.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println(reverse);
		
	}
	
	//by using Recursion
	
	public static void reverseNameUsingRecursion(String name,int l) {
		if(l<1) {
			return;
		}
		String rev="";
		char ch=name.charAt(l-1);
		rev=rev+ch;
		System.out.print(rev);
		reverseNameUsingRecursion(name, l-1);
	}
	
	//check for palindrome
	
	public static void palindrome(String name,int l) {
		String duplicate=name;
		if(l<1) {
			return;
		}
		String rev="";
		char ch=name.charAt(l-1);
		rev=rev+ch;
		System.out.print(rev);
		if(duplicate==rev) {
			System.out.println(true);
		}
		reverseNameUsingRecursion(name, l-1);

	}

	
	public static void main(String[] args) {
		String s="Ramesh";
		//ReverseString.reverseString(s);
		//ReverseString.reverseNameUsingRecursion(s,s.length());
		ReverseString.palindrome("ABCDCBA", 7);
	}
}
