package Doubly_Linked_List;



public class DoublyLinkedList {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data= data;
			this.next = null;
			this.prev =null;
		}
		Node(int data,Node next,Node prev){
			this.data= data;
			this.next = next;
			this.prev =prev;
		}
	}
	public DoublyLinkedList() {
      head =null;	// TODO Auto-generated constructor stub
      tail = null;
	}
	void insertAtbeginning(int value){
		Node newnode =new Node(value);	
		if(head == null) {
				head = newnode;
			}
			else {
				newnode.prev =null;
				newnode.next = head;
				head.prev = newnode;
				head = newnode;
			}
	}
	void insertAtLast(int value){
		Node newNode = new Node(value);
		Node temp = head;
		while(temp.next!=null) {
			temp =temp.next;
		}
		temp.next = newNode;
		newNode.prev =temp; 
	}
	
	void display() {
		Node temp =head;
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	void insertAtpos(int pos,int value) {
		Node newNode = new Node(value);
		if(pos == 0) {
			insertAtbeginning(value);
		}
		Node temp = head;
		while(pos >0 && temp.next !=null) {
			pos--;
			if(pos == 1) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next.prev = newNode;
				temp.next = newNode;
				return;
			}
			temp = temp.next;
		}
		insertAtLast(value);
	}
	void deleteAtbeggining() {
		if(head == null) {
			System.out.println("No List");
			return;
		}
		head = head.next;
		head.prev= null;
	}
	void deleteAtlast() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next.prev =null;
		temp.next = null;
	}
	void deleteAtpos(int pos) {
		if(pos == 0) {
			deleteAtbeggining();
			return;
		}
		Node temp = head;
		while(pos >0 && temp.next != null&& temp.next.next !=null) {
			
			if(pos == 1) {
				temp.next.next.prev = temp;
				temp.next = temp.next.next;
				return;
			}
			pos--;
			temp = temp.next;
		}
		deleteAtlast();
	}
}
