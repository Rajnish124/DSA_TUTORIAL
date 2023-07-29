package com.bs.ll;

public class DLL {
	
	Node head;
	Node tail;
	int size;
	
	DLL(){
		this.size=0;
	}
	
	public void addFirst(int value) {
		Node node=new Node(value);
		
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		
		head=node;
		
	}
	
	public void display() {
		Node node=head;
		while(node!=null) {
			
			System.out.print(node.value+"-> ");
			node=node.next;
		}
		System.out.println("END");
	}
	
	
		class Node{
			int value;
			Node next;
			Node prev;
			
			Node(int value){
				this.value=value;
			}
			
			Node(int value,Node next,Node prev){
				this.value=value;
				this.next=next;
				this.prev=prev;
						
			}
		}
}
