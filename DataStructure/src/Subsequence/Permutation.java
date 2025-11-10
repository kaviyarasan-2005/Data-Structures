package Subsequence;

import java.util.*;

public class Permutation {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> res = new ArrayList<>();
		int len = arr.length;
		permutate(res,new ArrayList<>(),arr,len,new boolean[len]);
		for(List<Integer> i:res) {
			System.out.println(i.toString());
		}
	}
	private static void permutate( List<List<Integer>> res, List<Integer> list, int[] arr, int len, boolean[] picked) {
		
		if(list.size() == len) {
			res.add(new ArrayList<>(list));
			return;
		}
		for(int i=0;i<len;i++) {
			if(!picked[i]) {
				picked[i] = true;
				list.add(arr[i]);
				// add each number  and mark as picked
				permutate(res,list,arr,len,picked);
//				remove and mark as not picked for next iteration
				list.remove(list.size()-1);
				picked[i] = false;
			}
		}
	}
}
