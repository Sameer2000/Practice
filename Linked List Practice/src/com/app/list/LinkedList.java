package com.app.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {

	protected Node head;

	public LinkedList() {
	}

	protected void populateNodes() {
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

		lList.addNodeSpecificPosition(10, 7);

		lList.deleteNode(2);

		lList.printInReverse();

		lList.printAllNodes();
		
		lList.reverseList();
		
		System.out.println("\n===========================================\n");
		
		/** Hackerrank Prob 1 **/
		lList.printAllNodes();
	}

	/** Hackerrank Prob 2 **/
	public void insertTailNode(int data) {
		Node tempHead = this.head;
		while (tempHead.next != null) {
			tempHead = tempHead.next;
		}
		tempHead.next = new Node(data);
	}

	/** Hackerrank Prob 1 **/
	public void printAllNodes() {
		Node tempNode = this.head;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}

	}

	/**
	 * Hackerrank Prob Insert a node at a specific position in a linked list
	 **/
	public void addNodeSpecificPosition(int data, int position) {
		Node tempHead = this.head;

		/** if position = 0 **/
		if (position == 0) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			return;
		}

		Node prev = null;
		int index = 0;
		while (tempHead != null) {
			if (position == index++) {
				Node newNode = new Node(data);
				newNode.next = tempHead.next;
				prev.next = newNode;
				break;
			}
			prev = tempHead;
			tempHead = tempHead.next;
		}
	}

	/** Delete a Node at specific position. **/
	public void deleteNode(int position) {
		if (position == 0) {
			this.head = head.next;
		}

		Node tempHead = this.head;
		Node prev = null;
		int index = 0;
		while (tempHead != null) {
			if (index++ == position) {
				prev.next = tempHead.next;
			}
			prev = tempHead;
			tempHead = tempHead.next;
		}
	}

	public void printInReverse() {
		List<Integer> list = new ArrayList<>();

		Node tempHead = this.head;
		while (tempHead != null) {
			list.add(tempHead.data);
			tempHead = tempHead.next;
		}

		Collections.reverse(list);
		System.out.println(list);

	}

	public void reverseList() {
		Node current = this.head;
		Node prev = null;
		while(current != null){
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		this.head = prev;
	}

}
