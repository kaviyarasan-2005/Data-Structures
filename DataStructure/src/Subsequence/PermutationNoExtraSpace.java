package Subsequence;
import java.util.*;
public class PermutationNoExtraSpace {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> res= new ArrayList<>();
		permutate(0,arr,res,arr.length);
		for(List<Integer> i : res) {
			System.out.println(i.toString());
		}
	}
	private static void permutate(int ind, int[] arr,List<List<Integer>> res,int len) {
		if(len == ind) {
			res.add(new ArrayList(list(arr,len)));
			return;
		}
	
		for(int i =ind;i<len;i++) {
			swap(arr,i,ind);
			// here send ind insted of i because i end loop quicky ind can permuate all combinations
			permutate(ind+1,arr,res,len);
			swap(arr,i,ind);
		}
		
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static List<Integer> list(int[] arr,int len){
		List<Integer> lis = new ArrayList<>();
		for(int i=0;i<len;i++) {
			lis.add(arr[i]);
		}
		return lis;
	}
}
