package day17;

public class DataConversions {

	public static void main(String[] args) {

		//Scenario 1: String --> int, double, boolean, char (not possible) -- un-boxing
		// String --> int
//		String s1 = "10";
//		String s2 = "20";
//
//		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
//		System.out.println(sum);
		
		//String --> double
//		String s1= "10.5";
//		String s2= "5.15";
//		double sum = Double.parseDouble(s1) + Double.parseDouble(s2);
//		System.out.println(sum);

		//String --> boolean
//		String s = "true";
//		boolean bool = Boolean.parseBoolean(s);
//		System.out.println(bool);
		
		//String --> char  -- cannot convert 
//		String s = "A";
//		Character.
		
		//Scenario 2: int, double, bool, char --> String -- auto-boxing
		
//		int x = 100;
//		String s = String.valueOf(x);
//		
//		double d = 10.5;
//		String s1 = String.valueOf(d);
//		
//		boolean b = true;
//		String s2 = String.valueOf(b);
//		
//		char c = 'A';
//		String s3 = String.valueOf(c);
		
		//Scenario 3: 
		
		// int --> double
//		int x = 10;
//		double d = x;
//		System.out.println(d);
		
		//double --> int
		double d = 10.5;
		int x = (int) d;
		System.out.println(x);
		
		
	}

}
