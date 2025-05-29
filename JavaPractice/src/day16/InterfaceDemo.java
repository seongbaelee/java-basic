package day16;

interface Shape {
	int length = 10; // final and static by default
	int width = 20; // final and static by default

	// public by default
	void circle(); // abstract method

	// public by default
	default void square() {
		System.out.println("this is square - default method...");
	}

	// public by default
	static void rectangle() {
		System.out.println("this is rectangle - static method...");
	}

}

public class InterfaceDemo implements Shape {

	// default by default, so need to change it to public
	public void circle() {
		System.out.println("this is circle - abstract method...");
	}

	void triangle() {
		System.out.println("this is triangle..");
	}

	public static void main(String[] args) {
		// Scenario 1
//		InterfaceDemo obj = new InterfaceDemo();
//		obj.circle(); //abstract method
//		obj.square(); //default		
//		obj.triangle();
//		Shape.rectangle(); //static
//		System.out.println(Shape.length+Shape.width); //static

		// Scenario 2
		// for static variables and method, we need to call it directly with interface
		// name
		Shape obj = new InterfaceDemo();
		obj.circle();
		obj.square();
		System.out.println(Shape.length + Shape.width);

		Shape.rectangle();
	}

}
