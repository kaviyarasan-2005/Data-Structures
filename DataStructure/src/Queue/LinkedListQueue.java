package Queue;

public class LinkedListQueue {
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data= data;
			this.next =null;
		}
	
	}
	Node head;
	Node tail;
	public LinkedListQueue() {
		head = null;
		tail=null;
	}
	void Display(){
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	void enque(int val) {
		if(head == null ) {
			head = new Node(val);
			tail = head;
			return;
		}
		tail.next = new Node(val);
		tail = tail.next;
	}
	void deque() {
		if(head == null) {
			throw new NullPointerException("Queue is empty");
		}
		head = head.next;
		if(head == null) {
			tail = null;
		}
	}
	boolean isEmpty() {
		return head==null;
	}
	
		
}

