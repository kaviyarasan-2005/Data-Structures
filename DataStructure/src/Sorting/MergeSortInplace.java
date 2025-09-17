package Sorting;

import java.util.Arrays;

public class MergeSortInplace {
 public static void main(String[] args) {
	int[] arr = {3,2,4,1,-1,43,2,56,32,663,32};
	Sorting.mergesort(arr, 0, arr.length);
	System.out.println(Arrays.toString(arr));
 }
}
class Sorting{
	static void mergesort(int[] arr, int start,int end){
		if(end - start ==1) {
			return;
		}
		int mid = (start+end)/2;
		mergesort(arr, start, mid);
		mergesort(arr, mid, end);
		mergeinplace(arr, start, mid, end);
	}
	static void mergeinplace(int[] arr,int start,int mid,int end) {
		int[] res = new int[end-start];
		int i=start,j=mid,k=0;
		while(i<mid && j<end) {
			if(arr[i] <= arr[j]) {
				res[k++] = arr[i++];
			}
			else {
				res[k++]=arr[j++];
			}
		}
		while(i<mid) {
			res[k++]=arr[i++];
		}
		while(j<end) {
			res[k++]=arr[j++];
		}
		for(k=0;k<res.length;k++) {
			arr[k+start]=res[k];
		}
	}
}
