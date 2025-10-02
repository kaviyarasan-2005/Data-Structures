package Bit_Manupulation;

public class MathOperations {
	public static void main() {
		int a =10,b=20;
		while(b!=0) {
			int c = (a&b);
			a = a^b;
			b = c;
		}
		System.out.println("Addition of A and B is "+ a);
				
	}
}
