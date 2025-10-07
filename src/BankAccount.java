import file_exceptions.NegativeBalanceException;
public class BankAccount {
	private double balance;
	private double withdrawAmount;
	public BankAccount(double balance){
		this.balance = balance;
	}
	
	public void withdraw(double withdrawAmount) throws Exception{
		if (this.balance > this.withdrawAmount) {
			//throw new NegativeBalanceException("Withdraw Amount exceeds current account balance.");
		}
	}
}
