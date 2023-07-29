package com.bs.math;

public class HCF {
	
	public static void hcf(int N1,int N2) {
		int hcf = 0;
		for(int i=1;i<=Math.min(N1,N2);i++) {
			if(N1%i==0 && N2%i==0) {
				hcf=i;
			}
		}
		System.out.println("HCF of N1 and N2 is :"+hcf);
		
	}
	
	public static void main(String[] args) {
		HCF.hcf(20, 40);
	}

}
