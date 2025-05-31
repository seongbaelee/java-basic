package day18;

//Up-casting --> converting value from smaller to larger
//ex) 
//int --> long
//float --> double

//Down-casting --> converting value from larger to smaller
//ex)
//long --> int
//double --> float

public class TypeCastingConcept {

	public static void main(String[] args) {
		// up-casting --> automatic --> smaller to larger
//		int i = 100;
//		long l = i;
//		System.out.println(l);

//		float f = 10.5f;
//		double d = f;
//		System.out.println(d);

		// down-casting --> manual --> larger to smaller
//		long l = 100;
//		int i = (int) l;
//		System.out.println(i);

//		double d = 10.55;
//		float f = (float) d;
//		System.out.println(f);

		// example 1
//		int i = 100;
//		double d = i; //up-casting
//		System.out.println(d);

		// example 2
		double d = 10.5;
		int i = (int) d; // down-casting
		System.out.println(i);
	}

}
