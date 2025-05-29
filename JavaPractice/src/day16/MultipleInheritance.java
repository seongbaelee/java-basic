package day16;

public class MultipleInheritance implements I1, I2 {
	//(abstract method => need to override) need to update default => public
	public void m1() {
		System.out.println("this is m1 ...");
	}

	//(abstract method => need to override) need to update default => public
	public void m2() {
		System.out.println("this is m2 ...");
	}
	
	void m3() {
		System.out.println("this is m3...");
	}

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.m1();
		obj.m2();
		obj.m3();
		
		//x & y are static & final => need to access directly by interface
		System.out.println(I1.x + I2.y);
	}

}
