package Linkedlist;

class Node{
	int data;
	Node next;
	//this key word for instanse variable
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class Linkedlist {
	
		Node head;
		Linkedlist(){
			head =null;
		}
		
		public void insertAtbeginning(int val) {
			
			Node newnode = new Node(val);
			if(head == null) {
				head=newnode;
			}
			else{
				newnode.next=head;
				head = newnode;
			}
		}
		public void display() {
			Node temp =head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp= temp.next;
			}
		}
		public void insertAtpos(int pos,int val) {
			if(pos == 0) {
				insertAtbeginning(val);
				
			}
			else {
				Node newnode=new Node(val);
				Node temp =head; 
				for(int i=1;i<pos;i++) {
					temp = temp.next;
					if(temp == null) {
						System.out.println("Invalid position");
						return;
					}
				}
					newnode.next=temp.next;
					temp.next=newnode;
				 
			}
		}
		public void insertAtlast(int val) {
			Node newnode = new Node(val);
			if(head == null) {
				insertAtbeginning(val);
				return;
			}
		
			Node temp = head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=newnode;
			
			
		}
		public void deleteAtbeginning() {
			Node temp =head;
			head = temp.next;
		}
		public void deleteAtpos(int pos) {
			if(pos == 1) {
				deleteAtbeginning();
			}
			
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
				 if(temp == null) {
					deleteAtlast();
					return;
				}
			}
			temp.next=temp.next.next;
		}
		public void deleteAtlast() {
			Node temp = head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next=null;
		}
		public void getpos(int pos) {
			Node temp = head;
			for(int i=1;i<pos;i++) {
				temp=temp.next;
			}
			System.out.println("position at "+pos+" - "+temp.data);
		}
		public void updateAt(int pos,int val) {
			Node newnode = new Node(val);
			Node temp = head;
			for(int i=1;i<pos-1;i++){
				temp=temp.next;
			}
			newnode.next = temp.next.next;
			temp.next=newnode;
		}
		public void Search(int val) {
			Node temp = head;
			int pos=1;
			while(temp!=null) {
				if(temp.data == val) {
					System.out.println("Value found At pos "+ pos);
					return;
				}
				pos++;
				temp=temp.next;	
			}
			System.out.println("No value ");
		}
		public void reverse() {
			Node prev = null;
			Node cur = head;
			Node nex=head.next;
			while(cur!=null) {
				nex = cur.next;
				cur.next = prev;
				prev = cur;
				cur=nex;
			}
			head=prev;
		}
}



