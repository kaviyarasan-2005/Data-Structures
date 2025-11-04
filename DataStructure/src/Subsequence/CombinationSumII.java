package Subsequence;
import java.util.*;
public class CombinationSumII {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		List<List<Integer>> res = new ArrayList<>();
		int tar=6;
		combination(0,res,new ArrayList<>(),arr,tar,0);
		for(List<Integer> l : res) {
			for(int i:l) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	private static void combination(int ind,List<List<Integer>> res, List<Integer> list, int[] arr, int tar, int sum) {
		if(sum == tar) {
			res.add(new ArrayList<>(list));
			return;
		}
		if(sum>tar)return;
		
		for(int i=ind;i<arr.length;i++) {
			// here i>ind for ignore starting index
			if(i>ind&&arr[i]==arr[i-1])continue;
			list.add(arr[i]);
			combination(i+1, res, list, arr, tar, sum+arr[i]);
			list.remove(list.size()-1);
		}
	}
}
