package day6;

public class Assignments {

	public static void main(String[] args) {
		
		//1)Find sum of Elements in Array
//		int a[] = {1,2,3,4,5};
//		int sum = 0;
//		for(int num: a) {
//			sum = sum + num;
//		}
//		System.out.println(sum);
		
		//2) Print Even and Odd numbers from array.
		int a[] = {1,2,3,4,5};
		int even = 0;
		int odd = 0;
		for(int num: a) {
			if(num % 2 == 0) {
				even += 1;
			} else {
				odd +=1;
			}	
		}
		System.out.println("Even number count is: " + even);
		System.out.println("Odd number count is: " + odd);

	}

}
