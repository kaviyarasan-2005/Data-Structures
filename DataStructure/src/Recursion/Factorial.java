package Recursion;

public class Factorial {
	public static void main(String[] args) {
		int a =5;
		int res= fact(a);
		System.out.println(res);
	}
	static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return n*fact(n-1);
	}
}
