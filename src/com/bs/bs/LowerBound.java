package com.bs.bs;

public class LowerBound {
	
	
	public static int findLowerBound(int[] arr,int n,int x,int low, int high) {
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(x>arr[mid]) {
				low=mid+1;
			}
			else if(x!=arr[mid] && x<arr[mid]) {
				return mid;
			}
		}
		return -1;
		
	}
	
	//second way to do 
	
	public static int lower(int[] arr,int n, int x,int low,int high) {
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
		int[] arr={3,5,8,15,19};
		int n=arr.length;
		//int index=LowerBound.findLowerBound(arr, n, 4, 0, n-1);
		int index=LowerBound.lower(arr, n, 1, 0, n-1);
		if(index!=-1) {
			System.out.println(arr[index]+" "+"is lower bound");
		}
		
	}

}
