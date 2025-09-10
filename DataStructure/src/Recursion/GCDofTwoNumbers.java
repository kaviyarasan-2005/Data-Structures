// use
package Recursion;
import java.math.*;
public class GCDofTwoNumbers {
	public static void main(String[] args) {
		int a = 36;
		int b = 120;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int count =0;
		System.out.println(gcd(min,max,count));
	}
	static int gcd(int min,int max,int count) {
		count++;
		if(max % (min/count) == 0) {
			return min/count;
		}
		return gcd(min,max,count);
	}
}
