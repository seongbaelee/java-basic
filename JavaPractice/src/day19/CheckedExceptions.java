package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("program started...");
		System.out.println("program is in progress...");
		
//		try {
//			FileInputStream file = new FileInputStream("C:\\Users\\Seongbaelee\\Desktop");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		FileInputStream file = new FileInputStream("C:\\Users\\Seongbaelee\\Desktop");
		
		System.out.println("program is completed");

	}

}
