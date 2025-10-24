package Subsequence;
import java.util.*;
public class Subset {
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = arr.length;
		List<Integer> list = new ArrayList<>();
		subset(0,list,arr,n);
	}
	private static void subset(int ind , List<Integer> list, int[] arr, int n) {
		if(ind == n) {
			for(int i : list) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		list.add(arr[ind]);
		subset(ind+1,list,arr,n);
		list.remove(list.size()-1);
		subset(ind+1,list,arr,n);
	}
}
