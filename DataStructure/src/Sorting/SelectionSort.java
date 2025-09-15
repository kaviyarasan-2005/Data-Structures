package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3,55,12,76,9,1,87,3,99,26,24,13,32};
		int len = arr.length;
		for(int i=0;i<len-1;i++) {
				int st =i;
			for(int j=i;j<len;j++) {
				if(arr[st] >arr[j]) {
					st=j;
					arr[st]=arr[j];
				}
			}
			int temp = arr[i];
			arr[i] = arr[st];
			arr[st] = temp;
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
