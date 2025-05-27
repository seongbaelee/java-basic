package day15;

class Bank {
	double roi() {
		return 0;
	}
}

class IC extends Bank {
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank {
	double roi() {
		return 11.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		IC ic = new IC();
		System.out.println(ic.roi());
		
		SBI sbi = new SBI();
		System.out.println(sbi.roi());
	}

}
