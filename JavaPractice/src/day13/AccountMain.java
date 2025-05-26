package day13;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountNo(10101);
		acc.setName("John");
		acc.setAmount(1224.25);
		
		System.out.println(acc.getAccountNo());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());

	}

}
