package day7;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,50,40};
		
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}
