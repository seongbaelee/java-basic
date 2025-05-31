package day17;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// primitive
		int i = 10;
		double d = 10.5;
		char c = 'A';
		boolean b = true;

		// converting primitives to object type - Auto-boxing
		Integer iobj = i; // object
		Double dobj = d;
		Character cobj = c;
		Boolean bobj = b;

		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);

		// converting objects to primitive type - Un-boxing
		int intValue = iobj;
		double doubleValue = dobj;
		char charValue = cobj;
		boolean boolValue = bobj;

		System.out.println(intValue);
		System.out.println(doubleValue);
		System.out.println(charValue);
		System.out.println(boolValue);
		
	}

}
