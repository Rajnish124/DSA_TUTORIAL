package com.bs.sorting;
import java.util.Arrays;
public class SelectionSort {
	
	
	public static void selectionSort(int[] arr,int n) {
		//outer loop for iteration
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
		int[] arr= {20,12,10,15,2};
		int n=arr.length;
		SelectionSort.selectionSort(arr, n);
		SelectionSort.printArray(arr);
		
	}
}
