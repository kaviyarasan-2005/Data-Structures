package Queue;

public class Main {

	public static void main(String[] args) {
		ArrayQueue que = new ArrayQueue();
		que.enque(1);
		que.enque(2);
		que.enque(3);
		que.enque(4);
		que.enque(5);
		que.enque(6);
		que.Display();
		que.deque();
		que.enque(99);
		que.Display();
		System.out.println("      Stack  with Linked list");
		LinkedListQueue lque = new LinkedListQueue();
		lque.enque(0);
		lque.enque(1);
		lque.enque(2);
		lque.enque(3);
		lque.enque(4);
		lque.enque(5);
		lque.enque(6);
		lque.enque(7);
		lque.Display();
		lque.deque();
		lque.deque();
		lque.Display();
		lque.enque(1);
		lque.Display();
	}

}
