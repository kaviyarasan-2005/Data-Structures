package Recursion;
// sum of n natural number also
public class triangular_number {
	public static void main(String[] args) {
		System.out.println(tri(5));
	}
	static int tri(int n) {
		if(n == 1) {
			return 1;
		}
		return n+tri(n-1);
	}
}