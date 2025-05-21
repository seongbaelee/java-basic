package day7;

import java.util.Arrays;

public class Assignments {

	public static void main(String[] args) {

		// 1) Sorting elements using for loop
		// approach1: Linear sort
//		int arr[] = {5,3,8,4,2};
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			int minIndex = i;
//			
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[minIndex] > arr[j]) {
//					minIndex = j;
//				}
//			}
//			
//			int temp = arr[i];
//			arr[i] = arr[minIndex];
//			arr[minIndex] = temp;
//		}

		// approach2: Bubble sort
//		int arr[] = { 5, 3, 8, 4, 2 };
//		
//		for (int i = 0; i < arr.length - 1; i++ ) {
//			for (int j = 0; j < arr.length - 1 - i; j++ ) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));

		// 2) Find Missing In Number in array
//		int a[] = { 1, 3, 4, 5 };
//		int sum1 = 0;
//		int sum2 = 0;
//
//		for (int num : a) {
//			sum1 += num;
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			sum2 += i;
//		}
//
//		System.out.println(sum2 - sum1);

		// 3) Find largest & lowest number in array
		int a[] = { 100, 300, 200, 50, 20 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println("largest: " + a[a.length - 1]);
		System.out.println("lowest: " + a[0]);

	}

}
