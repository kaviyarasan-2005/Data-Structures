package Bit_Manupulation;
// only 2 power 
public class MultiplyDivision {
	public static void main(String[] args) {
		int a =10;
		System.out.println(a>>2);
		System.out.println(a<<2);
//		moduloo x%(1<k)-1;
		System.out.println(a&((1<<1)-1));
		// swap
		int x =10;
		int y=20;
		System.out.println(x+" "+y);
		x =x^y;
		y=x^y;
		x=x^y;
		System.out.println(x+" "+y);
	}
}
