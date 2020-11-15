
public class Account {
	
	//initialize static variable called numAccounts to 0
	static int numAccounts = 0;
	
	//constructor method for Account that ads 1 to numAccounts for each new Account object
	public Account() {
		numAccounts++ ;
	}
	
	//creates static method to retrieve the number of Account objects created by the Account class
	static int getNumAccounts() {
		return numAccounts;
	}
	
	public static void main(String[] args) {
		
		//creates 3 new accounts
		Account Acct1 = new Account();
		Account Acct2 = new Account();
		Account Acct3 = new Account();

		//invokes the getNumAccounts method and prints the number of accounts created
		System.out.println("Number of Accounts: " + Account.getNumAccounts());
		
	}

}
