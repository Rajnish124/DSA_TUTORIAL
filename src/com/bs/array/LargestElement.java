package com.bs.array;

public class LargestElement {
	
	//By using Bubble sort
	public static int largest(int arr[], int n)
    {
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
       System.out.println("Largest Element:"+" "+arr[n-1]);
       return arr[n-1];
    }
	
	public static void main(String[] args) {
		
		int[] arr= {1, 8, 7, 56, 90};
		LargestElement.largest(arr, 5);
	}
	//just for checking    

}
