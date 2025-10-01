package Bit_Manupulation;

public class Power_of_Two {
	public static void main(String[] args) {
		int a=8;
		if((a&(a-1)) == 0){
			System.out.println("Power of Two");
		}
		else {
			System.out.println("Not a power of 2");
		}
	}
}
