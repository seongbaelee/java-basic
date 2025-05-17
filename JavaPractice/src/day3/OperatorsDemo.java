package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		// 1. Arithmetic operations
		int a = 20, b = 10;
		System.out.println("Sum of a and b is: " + (a + b));
		System.out.println("Diff of a and b is: " + (a - b));
		System.out.println("Mul of a and b is: " + (a * b));
		System.out.println("Div of a and b is: " + (a / b));
		System.out.println("Modulo of a and b is: " + (a % b));

		// 2. Relational / Comparison operators
		b = 20;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		// 3. Logical operators
		boolean x = true, y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		System.out.println(x && !y);

		boolean b1 = 10 > 20;
		System.out.println(b1);

		boolean b2 = 20 > 10;
		System.out.println(b2);

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		System.out.println((10 < 20) && (20 > 10));
		System.out.println((10 < 20) || (20 > 10));
	}

}
