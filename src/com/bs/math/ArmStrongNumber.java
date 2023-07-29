package com.bs.math;

public class ArmStrongNumber {
	
	public static void checkArmstrong(int N) {
		
		int lastDigit;
		int duplicate=N;
		int sum=0;
		while(N>0) {
			lastDigit=N%10;
			sum=sum+(lastDigit*lastDigit*lastDigit);
			N=N/10; 	
		}
		
		if(sum==duplicate) {
			System.out.println(duplicate+" "+"is a Armstrong number");
		}
		else {
			System.out.println(duplicate+" "+"is not a Armstrong number");
		}
		
	}
	public static void main(String[] args) {
		ArmStrongNumber.checkArmstrong(371); 	
		
	}

}
