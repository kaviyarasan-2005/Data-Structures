package Circular_Linked_List;

public class CircularLinkedList {
	Node last = null;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		Node(int data,Node next){
			this.data = data;
			this.next = next;
		}
	}
	public CircularLinkedList() {
		last =null;
	}
	public void insertAtbeggining(int value) {
		Node newNode = new Node(value);
		 if(last == null) {
			 newNode.next = newNode;
			 last = newNode;
			 return;
		 }
		 newNode.next = last.next;
		 last.next = newNode;		 
	}
	public void insertAtEnd(int value) {
		Node newNode = new Node(value);
		if(last == null) {
			insertAtbeggining(value);
			return;
		}
		newNode.next = last.next;
		last.next=newNode;
		last = newNode;
		
	}
	public void Display() {
		Node temp =last;
		do {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}while(temp != last );
		System.out.println();
	}
	public void DeleteAtBeggining() {
		if(last ==null) {
			System.out.println("No values in the list ");
			return;
		}
		last.next=last.next.next;
	}
	
	public void DeleteAtLast() {	
		Node temp = last;
		while(temp.next != last) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		last = temp;
	}

}
