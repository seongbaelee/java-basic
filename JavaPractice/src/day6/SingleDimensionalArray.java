package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		// 1) Declaring Array

		// Approach1 : declaration
//		int a[] = new int[5];
//		// 2) Adding values into array
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;

		// Approach2 : declaration + assigned data
		int a[] = { 10, 20, 30, 40, 50 };

		// 3) Find size of an array
//		System.out.println(a.length);

		// 4) Read single value from an array
//		System.out.println(a[2]);
//		System.out.println(a[0]);

		// 5) Read multiple values from an array

		// normal for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// enhanced for loop / for ... each loop
//		for(int x: a) {
//			System.out.println(x);
//		}
	}

}
