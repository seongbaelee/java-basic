package day11;

public class StudentMain {

	public static void main(String[] args) {
//		Student student = new Student();

		// 1) assign data using object reference
//		student.sid = 101;
//		student.sname = "John";
//		student.grade = 'A';

		// 2) assigning data by using user defined method
//		student.setStudentData(101, "John", 'B');

		// 3) using constructor
		Student student = new Student(101, "John", 'C');
		student.printStudentdata();
	}

}
