package com.bs.queue;

public class Queue {
	
	//implement queue using array
	int size;
	int arr[];
	int front;
	int rear;
	
	public Queue(int size) {	
		arr=new int[size];
		this.size=size;
		front=-1;
		rear=-1;
	}
	
	
	public boolean isFull() {
		if(front==0 && rear==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int x) {
		if(isFull()) {
			System.out.print("Queue is Full");
			return;
		}
		else {
			
			if(front==-1) {
				front=0;
			}
			rear++;
			arr[rear]=x;
			System.out.println("Inserted"+" "+x);
		}
		
		
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is EMPTY");
			return -1;
		}
		else {
			int y=arr[front];
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
			}
			System.out.println("deleted"+" "+y);
			return y;
			
		}
	}
	
	public void display() {
		
		if(isEmpty()) {
			System.out.println("This is Empty Queue");
		}
		else {
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	}
	
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.display();
		
	}
	

}
