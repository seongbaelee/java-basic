package day7;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a search number: ");
		int search_num = sc.nextInt();
//		int search_num = 30;
		boolean status = false;

		for (int value : a) {
			if (value == search_num) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}

		if (status == false) {
			System.out.println("Element not found");
		}
	}

}
