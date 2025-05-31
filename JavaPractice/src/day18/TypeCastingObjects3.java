package day18;

public class TypeCastingObjects3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ex1
//		Object o = new String("welcome");
//		StringBuffer sb = (StringBuffer) o; // Rule 1 (o), Rule 2 (o), Rule 3 (x)

		// Ex2
//		String s = new String("welcome");
//		StringBuffer sb = (StringBuffer) s; // Rule 1 (x)

		// Ex3
//		Object o = new String("welcome");
//		StringBuffer sb = (String) o; // Rule 1 (o), Rule 2 (x)
		
		// Ex4
//		String s = new String("welcome");
//		StringBuffer sb = (String) s; // Rule 1 (o), Rule 2 (x)
		
		// Ex5
//		Object o = new String("Welcome");
//		StringBuffer sb = (StringBuffer) o; // Rule 1 (o), Rule 2 (o), Rule 3 (x)
		
		// Ex6
		Object o = new String("welcome");
		String s = (String) o; // Rule 1 (o), Rule 2 (o), Rule 3 (o)
		
		System.out.println(s);
	}

}
