package com.bs.stack;

public class StackLL {
	
	Node head;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	
	public void push(int x) {
		Node newNode=new Node(x);
		if(isEmpty()) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		
		int top=head.data;
		head=head.next;
		return top;
	}
	
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return head.data;
	}
	
	
	
	
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		StackLL list=new StackLL();
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		while(!list.isEmpty()) {
			System.out.println(list.peek());
			list.pop();
		}
		
		
	}

}
