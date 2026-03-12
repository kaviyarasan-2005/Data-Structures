package Bit_Manupulation;

public class Unique_value_Using_EOX {
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,4,5,6,7,8,8,7,6,5,4,3};
		int len = arr.length;
		int result = 0;
		for(int i=0;i<len;i++) {
			result^=arr[i];
		}
		System.out.println(result);
	}
}
