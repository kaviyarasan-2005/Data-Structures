package Linkedlist;

public class Main {
		public static void main(String[] args) {
			Linkedlist list=new Linkedlist();
			Linkedlist list2 = new Linkedlist();
			list2.insertAtbeginning(0);
			list.insertAtbeginning(4);
			list.insertAtbeginning(2);
			list.insertAtbeginning(1);
			list.display();
			System.out.println();
			list.insertAtpos(2,3);
			list.insertAtpos(13,19);
			list.display();
			System.out.println();
			list.insertAtlast(5);
			list.display();
			System.out.println();
			list.deleteAtbeginning();
			list.display();
			System.out.println();
			list.deleteAtpos(2);
			list.display();
			System.out.println();
			list.deleteAtlast();
			list.display();
			System.out.println();
			list.getpos(2);
			list.insertAtlast(5);
			list.insertAtlast(6);
			list.insertAtlast(7);
			list.insertAtlast(8);
			list.display();
			System.out.println();
			list.updateAt(2,6);
			list.display();
			System.out.println();
			list.Search(6);
			list.Search(12);
			list.reverse();
			list.display();
			System.out.println();
			list2.display();
			
		}
}
