package day18;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class TypeCastingObects2 {

	public static void main(String[] args) {
//		Animal an = new Dog();
//		Cat ct = (Cat) an;
//		 a   b     c    d

		// Rule 1: conversion is valid or not
		// Rule 1: c & d must have some relationship (parent - child or child - parent)
//		Animal an = new Cat();
//		Cat ct = (Cat) an; // valid as per rule 1 

//		Dog dg = new Dog();
//		Cat ct = (Cat) dg; // invalid as per rule 1

		// Rule 2: assignment is valid or not
		// Rule 2: c must be either same or child of a
//		Animal an = new Dog();
//		Cat ct = (Cat) an; // valid as per rule 2

//		Animal an = new Dog();
//		Cat ct = (Dog) an; // invalid as per rule 2

		// Rule 3: The underlying object type of d must be either same or child of c
//		Animal an = new Dog();
//		Cat ct = (Cat) an; // invalid as per Rule 3
		
		// Rule 1, RUle 2, RUle 3
		Animal an = new Dog();
		Dog dg = (Dog) an; // rule 1 (o), rule 2 (o), rule 3 (o)
		
		
	}

}
