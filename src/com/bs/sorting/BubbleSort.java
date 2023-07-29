package com.bs.sorting;

public class BubbleSort {

	public static void bubbleSort(int[] arr,int n) {
		//for number of iteration to sort
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		
		
	}
	
	
	

  public static void printArray(int[] arr) {
	
	for(int a :arr) {
		System.out.print(a+" ");
	}
	
  }
	
	public static void main(String[] args) {
		int[] arr= {-2,45,0,11,-9};
		int size=arr.length;
		BubbleSort.bubbleSort(arr, size);
		BubbleSort.printArray(arr);
		
	}
	
}
