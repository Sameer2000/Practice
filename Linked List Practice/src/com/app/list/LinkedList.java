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
	
		lList.addNodeSpecificPosition(10, 3);
		
		/** Hackerrank Prob 1 **/
		lList.printAllNodes();
	}
	
	
	/** Hackerrank Prob 2 **/
	public void insertTailNode(int data){
		Node tempHead = this.head;
		while(tempHead.next != null){
			tempHead = tempHead.next;
		}
		tempHead.next = new Node(data);
	}
	
	/** Hackerrank Prob 1 **/
	public void printAllNodes(){
		Node tempNode = this.head;
		while(tempNode != null){
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		
	}
	
	/** Hackerrank Prob Insert a node at a specific position in a linked list **/
	public void addNodeSpecificPosition(int data, int position){
		Node tempHead = this.head;
		
		Node prev = null;
		int index = 0;
		while(tempHead != null){
			if(position == index++){
				Node newNode = new Node(data);
				newNode.next = tempHead.next;
				prev.next = newNode;
				break;
			}
			prev = tempHead;
			tempHead = tempHead.next;
		}
	}
	
}
