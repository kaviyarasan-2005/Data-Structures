package Subsequence;
import java.util.*;
public class SubsetOfKsum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,9,6,2,1,4,5};
		int k = 6;
		List<Integer> res = new ArrayList<>();
		subset(0,res,arr,k,0);
	}
	static void subset(int ind, List<Integer> res,int[] arr,int k,int sum){
		if(sum>k || ind >=arr.length){
			return;
		}
		sum+=arr[ind];
		
		res.add(arr[ind]);
		if(sum == k) {
			for(int i : res){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		subset(ind+1,res,arr,k,sum);
		sum -=arr[ind];
		res.remove(res.size()-1);
		subset(ind+1,res,arr,k,sum);
		
	}
}
