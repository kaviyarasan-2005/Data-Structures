package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {9,3,4,13,7,67,87,54,32,21,65,90};
		int len = arr.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(arr[j] > arr[j+1]){
					int temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
