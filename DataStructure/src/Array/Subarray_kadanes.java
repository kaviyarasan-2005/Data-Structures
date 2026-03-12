package Array;

public class Subarray_kadanes {
	public static void main(String args[]) {
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int len = arr.length;
		int max = arr[0];
		for(int i=0;i<len;i++) {
			int sum = 0;
			for(int j=i;j<len;j++) {
				sum+=arr[j];
				max = Math.max(max, sum);
			}
			
		}
		System.out.println(max);
		kadaneAlgo(arr);
	}
	public static void kadaneAlgo(int[] arr) {
		int len = arr.length;
		int max = Integer.MIN_VALUE;
		int sum =0;
		int start =0;
		int end =0;
		for(int i=0;i<len;i++) {
			if(sum == 0) {
			start =i;	
			}
			sum+=arr[i];
			if(sum > max) {
				max = sum;
				end = i;
			}
			if(sum <0) {
				sum = 0;	
			}
		}
		System.out.println("Kadane max is "+ max);
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
