package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

//		String s = "welcome";
//		String s = new String("welcome");
//		System.out.println(s);

		// length
//		String s = "welcome";
//		int l = s.length();
//		System.out.println(l);
//		System.out.println(s.length());

		// concat()
//		String s1 = "welcome ";
//		String s2 = "to java";
//		String s3 = " programming";
//		
//		System.out.println(s1 + s2 + s3);
//		System.out.println(s1.concat(s2).concat(s3));
//		
//		System.out.println("welcome" + " to java");
//		System.out.println("welcome".concat(" to java"));

		// trim()
//		String s = "      welcome      ";
//		System.out.println("before trim: " + s.length());
//		System.out.println("after trim: " + s.trim().length());

		// chatAt()
//		String s = "welcome";
//		char c = s.charAt(1);   //based on index
//		System.out.println(c);
//		
//		int i = s.indexOf("m");
//		System.out.println(i);

		// contains()
//		String s = "welcome";
//		System.out.println(s.contains("wel"));  //true
//		System.out.println(s.contains("Come")); //false
//		System.out.println(s.contains("Come".toLowerCase())); //true
//		System.out.println(s.contains("welome")); //sequence of characters is not matching -> false

		// equals(), equalsIgnoreCase()
//		String s1 = "welcome";
//		String s2 = "welcome";
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals("welcome"));  //true
//		System.out.println(s1.equals("Welcome"));  //false
//		System.out.println(s1.equalsIgnoreCase("Welcome"));  //true

		// replace()
//		String s = "welcome to selenium java python c#";
//		String replaced1 = s.replace("e", "X");
//		String replaced2 = s.replace("welcome", "goodbye");
//		System.out.println(replaced1);
//		System.out.println(replaced2);

		// substring()
//		String s = "welcome";
//		System.out.println(s.substring(2, 5)); //lco
//		System.out.println(s.subSequence(1, 3)); //el

		// toUpperCase(), toLowerCase()
//		String s = "Welcome";
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());

		// split()
		//Ex1
//		String s = "abc@xyz";
//		String a[] = s.split("@");
//		System.out.println(a[0]);  //abc
//		System.out.println(a[1]);  //xyz

		//Ex2
//		String s = "abc@gmail.com";
//		String a[] = s.split("@");
//		System.out.println(a[0]); // abc
//		System.out.println(a[1]); // gmail.com
		
		//Ex3 
//		String amount = "$15,20,55";   // output: 152055
//		System.out.println(amount.replace("$", "").replace(",", ""));

		//Ex4
//		String s = "abc,123@xyz";   // output  abc, 123, xyz
//		String output1 = s.split(",")[0];
//		String output2 = s.split(",")[1].split("@")[0];
//		String output3 = s.split(",")[1].split("@")[1];
//		
//		System.out.println(output1);
//		System.out.println(output2);
//		System.out.println(output3);
		
		//Ex5
		String s = "abc 123 xyz";
		System.out.println(Arrays.toString(s.split(" ")));

	}
}
