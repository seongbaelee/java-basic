package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Integer
//		System.out.println("Enter a number:");
//		int a = sc.nextInt();
//		System.out.println("Given value of a is: " + a);

		// Decimal
//		System.out.println("Enter a decimal number: ");
//		double d = sc.nextDouble();
//		System.out.println("Given decimal number is: " + d);

		// String
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Your name is: " + name);
	}
}
