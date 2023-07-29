package com.bs.stack;

import java.util.ArrayList;

public class StackArrayList {
	
	ArrayList<Integer> arrayList;
	
	public StackArrayList() {
		arrayList=new ArrayList<Integer>();
	}
	
	
	public void push(int x) {
		arrayList.add(x);
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return arrayList.remove(arrayList.size()-1);
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		return arrayList.get(arrayList.size()-1);
		
	}
	
	public boolean isEmpty() {
		return arrayList.size()==0;
	}
	
	public static void main(String[] args) {
		StackArrayList stack=new StackArrayList();
		stack.push(7);
		stack.push(6);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
				
	}

}
