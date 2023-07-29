package com.bs.stack;

public class Stack {
	
	int arr[];
	int top;
	int capacity;
	
	Stack(int size){
		arr=new int[5];
		capacity=size;
		top=-1;
		
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("stack is full");
			System.exit(1);	
		}
		
		arr[++top]=x;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
			
		}
		return arr[top--];
	}
	
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}

}
