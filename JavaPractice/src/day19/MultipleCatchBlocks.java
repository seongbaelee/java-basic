package day19;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		System.out.println("program is started...");
		Scanner sc = new Scanner(System.in);

		String s = null;
//		try {
//			System.out.println(s.length()); // NullPointerException
//		} catch (ArithmeticException e) {
//			System.out.println("handle Arithmetic Exception...");
//		} catch (NullPointerException e) {
//			System.out.println("null pointer exception handled...");
//		} catch (NumberFormatException e) {
//			System.out.println("number formal exception handled...");
//		}

		try {
			System.out.println(s.length()); // NullPointerException
		} catch (Exception e) {
			System.out.println("Exception handled...");
		}

		System.out.println("program is completed...");

	}

}
