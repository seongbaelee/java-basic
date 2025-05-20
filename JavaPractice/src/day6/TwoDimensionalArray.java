package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// declaration

		// Approach1
//		int a[][] = new int[3][2]; // declaration
//
//		// Adding values
//		a[0][0] = 100;
//		a[0][1] = 200;
//
//		a[1][0] = 300;
//		a[1][1] = 400;
//
//		a[2][0] = 500;
//		a[2][1] = 600;

		// Approach2
		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		// 3)Find size of an array
//		System.out.println(a.length);    //number of rows
//		System.out.println(a[0].length); //number of cols in specific row

		// 4) Read single value of an array
//		System.out.println(a[1][1]);

		// 5) Read multiple values from 2D array
		// normal for loop
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// enhanced for loop
		for(int arr[]: a) {
			for(int num: arr) {
				System.out.print(num + "  ");
			}
			System.out.println();
		}
	}

}
