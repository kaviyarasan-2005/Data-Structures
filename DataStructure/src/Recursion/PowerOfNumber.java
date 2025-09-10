package Recursion;

public class PowerOfNumber {
	public static void main(String[] args){
		System.out.println(pow(2,6));
	}
	static int pow(int a,int b) {
		if(b == 0) {
			return 1;
		}
		return a * pow(a,--b);
	}
}
