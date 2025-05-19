package day5;

public class Assignemnts {

	public static void main(String[] args) {
		// 1) reverse number
//		int num = 1236;
//		int reverseNum = 0;
//		while(num != 0) {
//			int digit = num % 10;
//			reverseNum = reverseNum * 10 + digit;
//			num = num / 10;
//		}
//		System.out.println(reverseNum);			
		// 2) palindrome number
//		int num = 121;
//		int numCopy = num;
//		int palNum = 0;
//		while(numCopy != 0) {
//			int digit = numCopy % 10;
//			palNum = palNum * 10 + digit;
//			numCopy = numCopy / 10;
//			
//			if(num == palNum) {
//				System.out.println(true);
//			}
//		}
		
		// 3) count number of digits in a number
//		int num = 423024;
//		int count = 0;
//		while (num != 0) {
//			num = num / 10;
//			count ++;
//		}
//		
//		System.out.println(count);
		
		// 4) count number of even and odd digits in a number
		int num = 1234567;
		int odd = 0;
		int even = 0;
		
		while(num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num / 10;
		}
		
		System.out.println("# of odd number is: " + odd);
		System.out.println("# of even number is: " + even);
		
		// 5) find sum of digits in a number
//		int num = 12345;
//		int sum = 0;
//		while(num != 0) {
//			int digit = num % 10;
//			sum = sum + digit;
//			num = num / 10;
//		}
//		
//		System.out.println(sum);
	}

}
