package day20;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// Declaration
		HashSet myset = new HashSet();
//		Set myset = new HashSet();		
//		HashSet<String> myset = new HashSet<String>();

		// adding elements into hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		// Printing hashset
		System.out.println(myset);

		// Size of hashset
//		System.out.println(myset.size());

		// Removing element
		myset.remove(100);
		System.out.println("After removing: " + myset);

		// Inserting element - Not possible

		// Access specific element - Not possible

		// Convert HashSet -> ArrayList
//		ArrayList al = new ArrayList(myset);
//		System.out.println(al);
//		System.out.println(al.get(2));

		// Read all the elements using for..each
//		for(Object x: myset) {
//			System.out.println(x);
//		}

		// Using iterator
//		Iterator it = myset.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// Clearing all the elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty()); // true

	}

}
