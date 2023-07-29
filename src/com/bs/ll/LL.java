package com.bs.ll;

public class LL {

	Node head;
	Node tail;
	int size = 0;

	public void addFirst(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;
	}

	public void addLast(int data) {
		if (tail == null) {
			addFirst(data);
			return;
		}
		Node node = new Node(data);
		tail.next = node;
		node = tail;
		size += 1;
	}

	
	public void insert(int data,int index) {
		if(index==0) {
			addFirst(data);
			return;
		}
		else if(index==size) {
			addLast(data);
			return;
		}
		else {
			Node temp=head;
			for(int i=1;i<index;i++) {
				temp=temp.next;
			}
			Node node=new Node(data,temp.next);
			temp.next=node;
			size++;
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			return;
		}
		else {
			head=head.next;
		}
		size++;
	}
	
	public void deleteLast() {
		if(head==null) {
			return;
		}
		else if(head==tail) {
			tail=null;
		}
		else {
			Node secondNode=head;
			Node lastNode=head.next;
			while(lastNode.next!=null) {
				lastNode=lastNode.next;
				secondNode=secondNode.next;
			}
			secondNode.next=null;
		}
	}
	 
	
	public int delete(int index) {
		if(index==0) {
			deleteFirst();
		}
		if(index==size-1) {
			deleteLast();
		}
		Node prev=getNode(index-1);
		int val=prev.next.data;
		prev.next=prev.next.next;
		return val;
	}
	
	public Node getNode(int index) {
		Node node=head;
		for(int i=0;i<size;i++) {
			node=node.next;
		}
		
		return node;
	}
	

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

}
