package day9;

public class StringReverse {

	public static void main(String[] args) {
		// Method1: concat from last char
//		String s = "selenium";
//		String reverse = "";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			reverse += s.charAt(i);
//		}
//
//		System.out.println("Reverse string: " + reverse);

		// Method2: converting string to char array
//		String s = "welcome";
//		String reverse = "";
//
//		char a[] = s.toCharArray();
//
//		for (int i = a.length - 1; i >= 0; i--) {
//			reverse += a[i];
//		}
//
//		System.out.println("Reverse string: " + reverse);
		
		//Method3: using StringBuffer
//		StringBuffer s = new StringBuffer("welcome");
//		System.out.println(s.reverse());
		
		//Method4: using StringBuilder
		StringBuilder s = new StringBuilder("welcome");
		System.out.println(s.reverse());
	}

}
