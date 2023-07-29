package com.bs.sorting;

public class Selection {
	
	public static void selection(int[] arr,int n) {
		
		for(int i=0;i<n-1;i++) {
			
			int min_index=i;
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		
	}
	
	
	 public static void printArray(int[] arr) {
			
			for(int a :arr) {
				System.out.print(a+" ");
			}
			
		  }
		
	
	
	public static void main(String[] args) {
		int arr[]= {13, 46, 24, 52, 20, 9};
		int size=arr.length;
		Selection.selection(arr, size);
		Selection.printArray(arr);
		
	}

}
