package Recursion;

public class Fibanacci_Series {
	public static void main(String[] args) {
		
		int a = fib(0,1,15,0);
		
	}
	static int fib(int n1,int n2,int base,int index) {
		System.out.print(n1+" ");
		if( base == index) {
			return 0;
		}
		return fib(n2,n1+n2,base,++index);
		
	}
}
