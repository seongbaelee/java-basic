package day19;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("program is started...");
		Scanner sc = new Scanner(System.in);

		// Example 1
//		System.out.print("Enter a number: ");
//		int num = sc.nextInt();
//		try {
//			System.out.println(100 / num); // ArithmeticException (num = 0)
//		} catch (ArithmeticException e) {
//			System.out.println("invalid data provided.");
//		}

		// Example 2
		int a[] = new int[5];
		System.out.print("Enter the position (0-4): ");
		int position = sc.nextInt();
		System.out.print("Enter the value: ");
		int value = sc.nextInt();

		try {
			a[position] = value; // ArrayIndexOutOfBoundsException (position = 5)
			System.out.println(a[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position");
			System.out.println(e.getMessage());
		}

		System.out.println("program is completed...");

	}

}
