package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		ArrayList mylist = new ArrayList();
//		List mylist = new ArrayList();
//		ArrayList<String> mylist = new ArrayList<String>();

		// Adding data into ArrayList
		mylist.add(100); // Integer
		mylist.add(10.5); // Double
		mylist.add("welcome"); // String
		mylist.add("A"); // Character
		mylist.add(true); // Boolean
		mylist.add(100); // Integer
		mylist.add(null);
		mylist.add(null);

		// Size of ArrayList
//		System.out.println("Size of an ArrayList" + mylist.size());

		// Printing ArrayList
		System.out.println("Printing data from ArrayList: " + mylist);

		// Remove element from ArrayList
//		mylist.remove(2);
//		System.out.println("After removing: " + mylist);

		// Insert element in the ArrayList
//		mylist.add(1, "java");
//		System.out.println("After inserting: " + mylist);

		// Modify element in the ArrayList
//		mylist.set(1, "python");
//		System.out.println("After replacing: " + mylist);

		// Access specific element from ArrayList
//		Object value = mylist.get(1);
//		System.out.println("Accessing specific element: " + value);

		// Reading all the elements from ArrayList
		// 1. using normal for loop
//		for(int i  =0; i < mylist.size(); i++) {
//			System.out.println(mylist.get(i));
//		}

		// 2. using for..each loop
//		for(Object o: mylist) {
//			System.out.println(o);
//		}

		// 3. using iterator
//		Iterator it = mylist.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// Checking Arraylist is empty or not
//		Boolean bool = mylist.isEmpty();
//		System.out.println(bool);

		// Removing multiple elemnts from ArrayList
//		ArrayList mylist2 = new ArrayList();
//		mylist2.add(100);
//		mylist2.add("welcome");
//		mylist2.add(true);
//		mylist.removeAll(mylist2);
//		System.out.println("After removing multiple elements: " + mylist);

		// Remove all the elements from ArrayList
		mylist.clear();
		System.out.println("After clearing: " + mylist);
		System.out.println("Is ArrayList empty? " + mylist.isEmpty());
	}

}
