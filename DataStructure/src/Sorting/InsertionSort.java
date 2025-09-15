package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {6,4,7,13,8,2,5,6,4};
		for(int i=0;i<arr.length;i++){
			for(int j=i;j>0;j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
