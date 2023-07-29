package com.bs.ll;

public class Main {
	
	public static void main(String[] args) {
		LL list=new LL();
		list.addFirst(6);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addLast(7);
		list.insert(100,3);
		list.display();
		//list.deleteFirst();
		//list.display();
		//list.deleteLast();
		//list.display();
		list.getNode(2);
		list.delete(2);
		list.display();
		
	}

}
