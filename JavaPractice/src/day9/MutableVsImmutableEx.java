package day9;

import java.util.Arrays;

public class MutableVsImmutableEx {

	public static void main(String[] args) {
		int a[] = {20,30,50,10};
		int b[] = a;
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); //mutable - can change
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
