package Stack;
import java.util.*;
// T for generic
public class ArrayLinkedListStack<T> {
		final int max_size = 30;
		T[] arr = (T[])new Object[max_size];
		int top;
		ArrayLinkedListStack() {
			top = -1;
		}
		void push(T val) {
//			top++
			if(top == max_size-1) {
				throw new IndexOutOfBoundsException("Stack is already Full");
			}
			arr[++top] = val;
		}	
		 T peek() {
			 if(top <0) {
				 throw new StackOverflowError("Stack is empty");
			 }
			return arr[top];
		}
		T pop() {
			 if(top <0) {
				 throw new StackOverflowError("Stack is empty");
			 }
			return arr[top--];
		}
		void Display() {
			System.out.print("Stack is  ");
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		boolean isEmpty() {
			return top == -1;
		}
		int size() {
			return top+1;
		}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
// add at end O(n) we can use add beginning by changing head now time complexity O(1);  
class ListStack{
	 Node head = null;
	 void push(int value) {
		 
		 if(head == null) {
			head = new Node(value);
			 return;
		 }
		 Node tail =head;
		 while(tail.next !=null) {
			 tail=tail.next;
		 }
		 tail.next = new Node(value);
		 tail=tail.next;
	 }
	 Node pop() {
		 if(head == null) {
			 throw new NullPointerException("Stack is Empty");
		 }
		 if(head.next == null) {
			 head =null;
			 return head;
		 }
		 Node tail =head;
		
		 while(tail.next !=null && tail.next.next !=null) {
			 tail = tail.next;
		 }
		 Node temp=tail.next;
		 tail.next =null;
		 return temp;
	 }
	 Node peek() {
		 if(head == null) {
			 throw new NullPointerException("Stack is Empty");
		 }
		 Node tail =head;
		 while(tail.next !=null) {
			 tail=tail.next;
		 }
		 return tail;
	 }
	 void Display() {
		 if(head == null) {
			 System.out.println("Stack is empty");
			 return;
		 }
		 Node tail =head;
		
		 while(tail.next !=null) {
			 System.out.print(tail.data+" -> ");
			 tail = tail.next;
		 }
		 System.out.println(tail.data);
	 }
}
