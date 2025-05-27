package day15;

public class Animal {
	String color = "white";
	
	Animal() {
		System.out.println("This is Animal...");
	}
	
	Animal(String name) {
		System.out.println(name);
	}

	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	String color = "black";
	
	Dog() {
		super();
//		System.out.println("This is dog...");
	}
	
	Dog(String name) {
		super(name);
	}

	void displayColor() {
		System.out.println(super.color);
	}

	void eat() {
//		System.out.println("eating bread");
		super.eat();
	}
}
