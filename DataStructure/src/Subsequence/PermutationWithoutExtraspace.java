package Subsequence;
import java.util.*;
public class PermutationWithoutExtraspace {
	private static void swap(int[] arr, int fst, int lst) {
		int temp = arr[fst];
		arr[fst] = arr[lst];
		arr[lst] = temp;
	}
	private static void permutation(int ind,int[] arr,int n) {
		if(ind == n) {
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i=ind;i<n;i++) {
			swap(arr,i,ind);
			permutation(ind+1,arr,n);
			swap(arr,i,ind);
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		permutation(0,arr,arr.length);
	}
	
}
