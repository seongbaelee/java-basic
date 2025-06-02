package day19;

public class ThrowKeyword {
	
	void checkSum(int num) {
		if(num < 1) {
			throw new ArithmeticException("Number is negative, cannot calculate square."); 
		} else {
			System.out.println(num * num);
		}
	}

	public static void main(String[] args) {
		ThrowKeyword tk = new ThrowKeyword();
		
		try {
			tk.checkSum(-1);
		} catch (Exception e) {
			System.out.println("data is not valid");
		}
	}

}
