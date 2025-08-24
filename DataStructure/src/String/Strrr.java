package String;

public class Strrr {
	public static void main(String[] args) {
		String str ="wer";
		
		String st = "wer";
		String s= st;
		System.out.println(str==s);
		if(str==s) {
			System.out.println("YES");
		}

		StringBuffer obj = new StringBuffer("Rajaa");
		obj = obj.append(" tat");
		System.out.println(obj.reverse());
	}
	
}
