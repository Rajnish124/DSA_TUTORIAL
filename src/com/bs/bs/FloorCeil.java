package com.bs.bs;

public class FloorCeil {

	public static int floorceil(int[] arr,int n, int x,int low,int high) {
		int floor=-1;

		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<=x) {
				floor=arr[mid];
				low=mid+1;
				//high=mid-1;
				
			}
			else {
				//low=mid+1;
				high=mid-1;
			}
			
		}
		
		return floor;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {3,4,4,7,8,10};
		int n=arr.length;
		
		int aa=FloorCeil.floorceil(arr, n, 5, 0, n-1);
		System.out.println(aa);
	}
	
}
