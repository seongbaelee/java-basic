package day13;

public class ThisKeyword {

	int x, y;

	ThisKeyword(int x, int y) {
		this.x = x;
		this.y = y;
	}

//	void setData(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}

	void display() {
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
//		ThisKeyword th = new ThisKeyword();
		ThisKeyword th = new ThisKeyword(10, 20);
//		th.setData(10, 20);
		th.display();
	}

}
