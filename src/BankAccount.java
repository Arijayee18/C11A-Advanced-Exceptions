import file_exceptions.NegativeBalanceException;
public class BankAccount {
	private double balance;
	private double withdrawAmount;

	public BankAccount(double balance){
		this.balance = balance;
	}

	public void withdraw(double withdrawAmount) throws NegativeBalanceException{
		if (this.balance < withdrawAmount) {
			throw new NegativeBalanceException(withdrawAmount - this.balance);
		} else{
			this.balance -= withdrawAmount;
		}

	}
	
	public void quickWithdraw(double withdrawAmount) throws NegativeBalanceException {
		if(withdrawAmount > this.balance){
			throw new NegativeBalanceException();
		} else{
			this.balance -= withdrawAmount;
		}
	}

}
