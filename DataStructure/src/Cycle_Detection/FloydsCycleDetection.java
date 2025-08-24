package Cycle_Detection;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class FloydsCycleDetection {
		public static void main(String[] args) {
			Node head = new Node(2);
			head.next = new Node(3); 
			head.next.next = new Node(4); 
			head.next.next.next = new Node(5); 
			head.next.next.next.next = new Node(6); 
			head.next.next.next.next.next = new Node(7); 
			head.next.next.next.next.next.next =head.next.next;
			Node slow = head;
			Node fast = head.next;
			while(fast != null && fast.next!=null) {
				if(slow == fast) {
					System.out.println("Cycle detected");
					return;
				}
				slow = slow.next;
				fast= fast.next.next;
			}
			System.out.println("No cycle");
		}
}
