package Search;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Length of array");
		int a = scan.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter a numbers");
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target number");
		int target = scan.nextInt();
		for(int i=0;i<a;i++){
			if(arr[i] == target) {
				System.out.println("Target Found at Position -> " + (i+1));
				return;
			}
		}
		System.out.println("Target Not found");
	}
}
