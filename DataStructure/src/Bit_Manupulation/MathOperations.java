package Bit_Manupulation;

public class MathOperations {
	public static void main(String[] args) {
		int a =15,b=21;
		while(b!=0) {
			int c = (a&b);
			a = a^b;
			b = c<<1;
		}
		System.out.println("Addition of A and B is "+ a);
				
	}
}
