package ie.itcarlow.Lab3;

public class SavingsAccount {
	private static int accountNumberCounter = 0;
	private int accountNumber;
	
	public SavingsAccount() {
		accountNumberCounter++;
		this.accountNumber = accountNumberCounter;
	}
	
	public int getAccountNumber() {return accountNumber;}
}
