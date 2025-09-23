package SlidingWindow;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] arr = {1,5,2,6,3,6,1,9,7};
		int len = arr.length;
		int k =3;
		int max = Integer.MIN_VALUE;
		int window =0;
		for(int i=0;i<k;i++) {
			window+=arr[i];
		}
		for(int i=k;i<len;i++) {
			window +=arr[i]-arr[i-k]; 
			max = Math.max(max, window);
		}
		System.out.println("Max Window size is - "+max);
	}
}	
