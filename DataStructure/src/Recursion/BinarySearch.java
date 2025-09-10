// Think like also only change a low and high while mid < tar or mid>tar then return by 
// recursion don't need to store result in res boolean 

package Recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,14};
		int target = 11;
		System.out.println(BinSearch(arr,0,arr.length-1,target));
	}
	static boolean BinSearch(int[] arr, int low,int high,int tar) {
		
		boolean res = false;
		if(low > high) {
			return false;
		}
		int mid = (high+low)/2;
		System.out.println(low+" "+high);
		if(arr[mid] == tar) {
			return true;
		}
		else if(arr[mid] > tar) {
			res = BinSearch(arr, low, mid-1,tar);
		}
		else if(arr[mid] < tar) {
			res = BinSearch(arr,mid+1,high,tar);
		}
		return res;
	}
}
