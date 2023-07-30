package com.bs.array;

public class SecondLargest {

	
	public static int print2largest(int arr[], int n) {
        int secondElement=0;
        for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
       for(int i=n-1;i>0;i--){
           if(arr[i-1]!=arr[i]){
               secondElement=arr[i-1];
               break;
           }
       }
       System.out.println("second largest :"+" "+secondElement);
       return secondElement;
    }
	
	
	public static void secondLargest(int[] arr,int n) {
		
		int largest=0;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
		}
		System.out.println("Largest:"+largest+" "+"SecondLargest"+" "+secondLargest);
		
		
	}
	
	public static void main(String[] args) {
		
		int [] arr= {12, 35, 1, 10, 34, 1};
		int n=arr.length;
		SecondLargest.print2largest(arr, n);
		SecondLargest.secondLargest(arr, n);
		//hello
		
		
	}
}
