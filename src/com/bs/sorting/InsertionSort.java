package com.bs.sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] arr,int n) {
		
		for(int i=0;i<=n-1;i++) {
			 int j=i;
			 while(j>0 && arr[j-1]>arr[j]) {
				 int temp=arr[j-1];
				 arr[j-1]=arr[j];
				 arr[j]=temp;
				 j--;
			 }
		}
		
	}
	
	 public static void printArray(int[] arr) {
			
			for(int a :arr) {
				System.out.print(a+" ");
			}
			
		  }
		
	
	
	public static void main(String[] args) {
		int[] arr= {9,5,1,4,3};
		int n=arr.length;
		InsertionSort.insertionSort(arr, n);
		InsertionSort.printArray(arr);
		
		
	}

}
