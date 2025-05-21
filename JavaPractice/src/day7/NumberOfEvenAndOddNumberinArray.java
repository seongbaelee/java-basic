package day7;

public class NumberOfEvenAndOddNumberinArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 8, 10, 15, 20, 25 };

		int even_count = 0;
		int odd_count = 0;

		for (int value : a) {
			if (value % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
		}

		System.out.println("Number of even numbers: " + even_count);
		System.out.println("Number of odd numbers: " + odd_count);
	}

}
