package Recursion;

public class BasicU {
	public static void main(String[] args) {
		int i=0;
		call(i);
	}
	private static void call(int i) {
		if(i == 11) {
			return;
		}
		call(i+1);
		System.out.print(i+" ");
		
	}
}
