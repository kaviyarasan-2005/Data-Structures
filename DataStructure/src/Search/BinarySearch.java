package Search;
// array should sorted
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("Enter a target Number in the array");
		int tar = scan.nextInt();
		int low =0;
		int high =15;
		int mid=0;
		while(low <= high) {
			mid = (low+high)/2;
			if(arr[mid] == tar) {
				System.out.println("Target at -> " + ++mid);
				return;
			}
			else if(tar < arr[mid]) {
				high = mid-1;
			}
			else if(tar > arr[mid]){
				low = mid+1;
			}
		}
		System.out.println("Target not found");
	}
}
