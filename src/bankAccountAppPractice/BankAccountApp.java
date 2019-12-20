package bankAccountAppPractice;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking ("Tom Wilson","123456789",1500);
		
		Savings saveacc1 = new Savings ("Rich lee","123456788",2500);
		
		saveacc1.showInfo();
		
		System.out.println("********************************");
		
		chkacc1.showInfo();
		
		
		saveacc1.deposit(5000);
		saveacc1.withdraw(200);
		saveacc1.transfer("YAYAYA", 3000);
	}

}
