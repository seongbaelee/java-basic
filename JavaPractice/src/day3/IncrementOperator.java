package day3;

public class IncrementOperator {

	public static void main(String[] args) {
//		int a = 10;
//		a++;
//		System.out.println(a);

		// post increment => initialization first then increment
		int a = 10;
		int a_res = a++;
		System.out.println(a_res);  //10

		// pre increment => increment first then initialization
		int b = 10;
		int b_res = ++a;
		System.out.println(b_res);  //11

	}
}
