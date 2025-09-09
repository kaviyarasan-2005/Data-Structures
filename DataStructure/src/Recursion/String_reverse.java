package Recursion;

public class String_reverse {
	public static void main(String[] args) {
		String st =reverse("kavi");
	}
	static String reverse(String s) {
		if(s.isEmpty()){
			return s;
		}
		else {
			System.out.print(s.charAt(s.length()-1) + " ");
		}
		return reverse(s.substring(0, s.length()-1));
	}
}	
