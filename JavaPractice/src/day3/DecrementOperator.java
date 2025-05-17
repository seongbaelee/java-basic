package day3;

public class DecrementOperator {

	public static void main(String[] args) {

//		int a = 100;
//		a = a - 1;
//		System.out.println(a);

		// post decrement
		int a = 100;
		int a_res = a--;
		System.out.println(a_res);  //100

		// pre decrement
		int b = 100;
		int b_res = --b;
		System.out.println(b_res);  //99

	}

}
