package Circular_Linked_List;

public class Main {
	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtbeggining(12);
		list.insertAtbeggining(34);
		list.insertAtbeggining(38);
		list.Display();
		list.insertAtEnd(11);
		list.insertAtEnd(19);
		list.Display();
		list.DeleteAtBeggining();
		list.Display();
		list.DeleteAtLast();
		list.Display();
	}
}
