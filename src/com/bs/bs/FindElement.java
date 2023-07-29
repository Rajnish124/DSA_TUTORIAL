package com.bs.bs;

public class FindElement {
	//By Iterative way
	public static int findNumber(int[] arr, int n,int x,int low, int high) {
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(x>arr[mid]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		return -1;
	}
	
	
	//By Recursive way
    public static int findNumber1(int[] arr, int n,int x,int low, int high) {
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(x==arr[mid]) {
				return mid;
			}
			else if(x>arr[mid]) {
				//low=mid+1;
				return findNumber1(arr, n, x, mid+1, high);
			}
			else {
				//high=mid-1;
				int index=FindElement.findNumber1(arr, n, 16, 0, mid-1);
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {3,4,6,7,9,12,16,17};
		int n=arr.length;
		//int index=FindElement.findNumber(arr, n, 16, 0, n-1);
		int index=FindElement.findNumber1(arr, n, 16, 0, n-1);
		if(index!=-1) {
			System.out.println(arr[index]+" "+"is found");
		}
	}

}
