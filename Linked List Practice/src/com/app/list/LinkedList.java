package com.app.list;

public class LinkedList {

	
	protected Node head;
	
	public LinkedList() {
	}
	
	protected void populateNodes(){
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3); 
		head.next.next.next = new Node(4); 
		head.next.next.next.next = new Node(5); 
		head.next.next.next.next.next = new Node(6); 
		head.next.next.next.next.next.next = new Node(7); 
	}

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.populateNodes();
		/** Hackerrank Prob 2 **/
		lList.insertTailNode(8);
		
		/** Hackerrank Prob 1 **/
		lList.printAllNodes();
	}
	
	public void insertTailNode(int data){
		Node tempHead = this.head;
		while(tempHead.next != null){
			tempHead = tempHead.next;
		}
		tempHead.next = new Node(data);
	}
	
	public void printAllNodes(){
		Node tempNode = this.head;
		while(tempNode != null){
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		
	}
	
}
