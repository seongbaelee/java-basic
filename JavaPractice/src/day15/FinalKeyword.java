package day15;

class Test {
	final int x = 100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.x);
		
		//not possible due to final keyword
//		test.x = 200;
//		System.out.println(test.x);
	}

}
