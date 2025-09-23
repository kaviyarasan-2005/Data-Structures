package SlidingWindow;

public class DynamicWindow {
	public static void main(String[] args) {
		int[] arr = {1,5,7,10,5,1,9,2,5};
		int len =arr.length;
		int sum =15;
		int j =0;
		int temp=0;
		int res=Integer.MAX_VALUE;
		for(int i=0;i<len;i++) {
			temp+=arr[i];
			while(temp>=sum) {
				res = Math.min(res, i-j+1);
				temp-=arr[j++];
			}
		}
	 System.out.println(res);
	}
}
