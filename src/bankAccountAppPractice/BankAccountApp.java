package bankAccountAppPractice;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		String file = "D:\\CSV\\NewBankAccounts.csv";
		
	List<String[]> newAccountHolder = utilities.CSV.read(file);
		
		for (String[] accountHolder : newAccountHolder) {
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
			
		}
	}

}
