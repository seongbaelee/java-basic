package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// Example 1: 1 ... 10
//		int i = 1; //initialization
//		while(i <= 10) { //condition
//			System.out.println(i); 
//			i++; //increment
//		}

		// Exmaple 2: print "hello" 10 times
//		int i = 1;
//		while(i <= 10) {
//			System.out.println("hello" + i);
//			i++;
//		}

		// Example 3: print even numbers btw 1 and 10
//		int i = 1;
//		while(i <= 10) {
//			if(i % 2 == 0) {		
//				System.out.println(i);
//			}
//			i++;
//		}

		// Exmaple 4: print 1 to 10 in desc
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}
}
