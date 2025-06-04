package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// declaration
//		HashMap hm = new HashMap();
//		Map hm = new HasMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David"); // with same key, the previous value will be replaced

		System.out.println(hm);

		// Size of hashmap
//		System.out.println("Size of hashmap: " + hm.size());

		// Remove pair
//		hm.remove(101);
//		System.out.println("After removing a pair: " + hm);

		// Access value of the key
//		System.out.println(hm.get(102));

		// Get all the keys from hashmap
//		System.out.println(hm.keySet());

		// Get all the values from hashmap
//		System.out.println(hm.values());

		// Get all the key & value pairs from hashmap
//		System.out.println(hm.entrySet());

		// Reading data from hashmap
		// 1. using for..each
//		for (int k : hm.keySet()) {
//			System.out.println(k + "    " + hm.get(k));
//		}

		// 2. using iterator
//		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
//		while(it.hasNext()) {
//			Entry<Integer, String> entry = it.next();
//			System.out.println(entry.getKey() + "     " + entry.getValue());
//		}

		// Clear hashmap
		hm.clear();
		System.out.println(hm.isEmpty()); // true
	}

}
