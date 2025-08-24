package Doubly_Linked_List;

public class Main {
  public static void main(String[] args) {
	  	DoublyLinkedList lis = new DoublyLinkedList();
	  	lis.insertAtbeginning(0);
	  	lis.display();
	  	lis.insertAtbeginning(2);
	  	lis.insertAtbeginning(4);
	  	lis.insertAtbeginning(7);
	  	lis.insertAtbeginning(9);
	  	lis.insertAtLast(12);
	  	lis.display();
	  	lis.insertAtpos(2, 3);
	  	lis.deleteAtbeggining();
	  	lis.deleteAtlast();
	  	lis.display();
	  	lis.deleteAtpos(1);
	  	lis.display();
  }
}
