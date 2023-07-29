package com.bs.bs;

public class InsertElement {
	
	public static int insertElement(int[] arr,int n, int x, int low, int high) {
		
		int ans=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>=x) {
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
	
		int[] arr= {1,2,4,7};
		int n=arr.length;
		int index=insertElement(arr, n, 2, 0, n-1);
		System.out.println(index);
	}
	

}
