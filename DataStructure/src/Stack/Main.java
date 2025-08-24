package Stack;

public class Main {
	public static void main(String[] args) {
		ArrayLinkedListStack<Integer> astack = new ArrayLinkedListStack<>();
//		astack.peek(); // error check
		astack.push(1);
		astack.push(2);
		astack.Display();
		System.out.println("Last element  =  "+astack.peek());
		astack.pop();
		astack.Display();
		astack.push(34);
		astack.Display();
		astack.pop();
		astack.pop();
		astack.Display();
		System.out.println("    Stack by linked List  ");
		
		ListStack lstack = new ListStack();
		lstack.push(1);
		lstack.push(2);
		lstack.push(3);
		lstack.push(4);
		lstack.push(5);
		lstack.push(6);
		lstack.push(7);
		lstack.Display();
		lstack.pop();
		lstack.Display();
		System.out.println(lstack.pop().data);
		System.out.println(lstack.peek().data);
	}
}
