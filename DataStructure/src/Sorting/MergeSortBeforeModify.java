package Sorting;
import java.util.*;
public class MergeSortBeforeModify {
	public static void main(String[] args) {
//		int[] arr = {4,5,3,2,1,6,7};
		int[] arr = {4,2,3,1};
		int[] res = mergesort(arr);
		System.out.println(Arrays.toString(res));
	}
	static int[] mergesort(int[] arr) {
		int len = arr.length;
		if(len == 1) return arr;
		int mid = len/2;
		int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergesort(Arrays.copyOfRange(arr, mid, len));
		return merge(left,right);
	}
	static int[] merge(int[] left,int[] right) {
		int i=0,j=0,k=0;
		int leftlen = left.length;
		int rightlen = right.length;
		int[] res = new int[leftlen+rightlen];
		while(i<leftlen && j<rightlen) {
			if(left[i]<=right[j]) {
				res[k++]=left[i++];
			}
			else {
				res[k++]=right[j++];}
		}
		while(i<leftlen) {
			res[k++]=left[i++];
		}
		while(j<rightlen) {
			res[k++]=right[j++];
		}
		return res;
	}
}
