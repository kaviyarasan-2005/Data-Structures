package Sorting;
import java.util.*;
class Sort{
	static void quicksort(int[] arr,int low,int high) {
		int st = low;
		int end =high;
		int mid = (low+high)/2;
		int p = arr[mid];
		if(low >= high) {
			return ;
		}
		while(st<=end) {
			while(arr[st]<p) {
				st++;
			}
			while(arr[end]>p) {
				end--;
			}
			if(st<=end) {
				int temp = arr[st];
				arr[st] = arr[end];
				arr[end] = temp;
				st++;
				end--;
			}
		}
		quicksort(arr,low,end);
		quicksort(arr, st, high);
		return ;
	}
}

public class QuickSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {5,2,9,7,2,5,8,6,4,3};
		Sort s = new Sort();
		s.quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}}
