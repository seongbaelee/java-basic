package day9;

public class Assignments {

	public static void main(String[] args) {
		// 1) check String is palindrome or not
//		String s = "Welcome";
////		String s = "MADAM";
//		String rev = "";
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev += s.charAt(i);
//		}
//
//		if (s.equals(rev)) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

		// 2) Remove Junk or Special Characters in String
//		String s = "wel4234come$@&#";  //output: welcome
//		String outcome = "welcome";
//		String result = "";
//		for(int i = 0; i < s.length(); i ++) {
//			for(int j = 0; j < outcome.length(); j++) {
//				if(outcome.charAt(j) == s.charAt(i)) {
//					result+= outcome.charAt(j);
//					break;
//				}
//			}
//		}
//		
//		System.out.println(result);

		// 3) How to Remove White Spaces in a String
//		String s = " we  l  co   m e  ";  //output: welcome
//		String outcome = s.replace(" ", "");
//		System.out.println(outcome);

		// 4) Count Occurrences of a Character in a String
		String s = "welcome";
		char ch = 'e';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}

		System.out.println(count);

		// 5) Count Words in a String
//		String s ="welcome to java";
//		String splitedStringArray[] = s.split(" ");
//		System.out.println(splitedStringArray.length);
	}

}
