package Heaps;

public class HeapMain {
	public static void main(String[] args) {
		Heaps hp = new Heaps();
		hp.insert(20);
		hp.insert(30);
		hp.insert(50);
		hp.insert(10);
		hp.insert(8);
		hp.insert(4);
		hp.insert(90);
		hp.insert(40);
		hp.print();
		hp.remove(4);
		System.out.println();
		hp.print();
	}
}
