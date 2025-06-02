package day19;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {

		System.out.println("program is started...");
		Scanner sc = new Scanner(System.in);

		// Example 1
//		System.out.print("Enter a number: ");
//		int num = sc.nextInt();
//		System.out.println(100 / num); //ArithmeticException (num = 0)

		// Example 2
//		int a[] = new int[5];
//		System.out.print("Enter the position (0-4): ");
//		int position = sc.nextInt();
//		System.out.print("Enter the value: ");
//		int value = sc.nextInt();
//		a[position] = value; // ArrayIndexOutOfBoundsException (position = 5)	
//		System.out.println(a[position]);

		// Example 3
//		String s = "welcome";
//		int num = Integer.parseInt(s); // NumberFormatException
//		System.out.println(num);

		// Example 4
		String s = null;
		System.out.println(s.length()); // NullPointerException

		System.out.println("program is completed...");
	}

}
