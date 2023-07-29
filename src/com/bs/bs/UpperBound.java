package com.bs.bs;

public class UpperBound {
	
	public static int upperBound(int[] arr, int n, int x, int low, int high) {
		
		int ans=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>x) {
				ans=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {2,3,6,7,8,8,11,11,11,12};
		int n=arr.length;
		int index=UpperBound.upperBound(arr, n, 8, 0, n-1);
		System.out.println(arr[index]+" "+"is upper bound");
		
	}

}
