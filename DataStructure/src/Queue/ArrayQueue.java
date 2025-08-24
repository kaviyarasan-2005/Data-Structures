package Queue;

public class ArrayQueue {
		
		int front =0;
		int rear = 0;
		int max =30;
//		ArrayQueue(){
			int[] arr = new int[max];
		
		boolean flag = false;
		void Display(){
			for(int i=front;i%29 <rear;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		//add value in queue
		void enque(int val) {
			if(front == rear && flag) {
				System.out.println("Queue already fill");
				return;
			}
			arr[rear%29] = val;
			rear++;
			flag = true;
		}
		void deque() {
			if(rear <= front ){
				// not work in all condition this say stack empty when stack full
				System.out.println("Queue empty");
			}
			front = front + 1 %29;
		}

}
