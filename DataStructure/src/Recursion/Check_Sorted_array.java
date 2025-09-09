package Recursion;

public class Check_Sorted_array {
	public static void main(String[] args) {
		
		int[] a = {0,1,2,3,4,5,6};
		int res = isSort(a,0);
		if(res == 0) {
			System.out.println("Not sorted");
		}
		else {
			System.out.println("Array is sorted");		
	}}
	static int isSort(int[] a,int l) {
		
		if(l == a.length -1 ) {
			return 1;
		}
		else if(a[l] > a[l+1]) {
			return 0;
		}
		return isSort(a,++l);
	}
}
