package Bit_Manupulation;

public class KthBit {
		public static void main(String[] args) {
			int k= 3;
			int val = 25;
			System.out.println( "View Kth bit "+(val &(1<<k)));
			System.out.println("Toggle the value  " + (val ^ (1<<k)));
		}	
		
}
