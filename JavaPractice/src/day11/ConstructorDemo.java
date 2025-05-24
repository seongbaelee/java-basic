package day11;

public class ConstructorDemo {

	int x, y;

	// default constructor
	ConstructorDemo() {
		x = 10;
		y = 20;
	}

	// parameterized constructor
	ConstructorDemo(int a, int b) {
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
//		ConstructorDemo cons = new ConstructorDemo();
//		cons.sum();

		ConstructorDemo cons = new ConstructorDemo(100, 200);
		cons.sum();
	}

}
