package day5;

public class JumpingStatements {

	public static void main(String[] args) {
//		for (int i = 1; i <=10; i++) {
//			if(i == 5) {
//				break;  //jump to out of for loop
//			}
//			System.out.println(i);
//		}

		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 5 || i == 7) {
				continue; //jump to the next iteration
			}
			System.out.println(i);
		}
	}

}
