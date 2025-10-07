/* Authors: Ethan Kleiber and Ari'Jaye Derritt
 * This class contains two kinds of withdraw methods, the first one will attempt to withdraw money from the current 
 * balance, and if that fails an error message will be thrown if a negative balance is provided. Similarly, The quick withdraw method 
 * will also attempt to withdraw from the current balance and if that fails, it handles the case where a negative balance is not provided, 
 * */
import file_exceptions.NegativeBalanceException;
public class BankAccount {
	private double balance;
	private double withdrawAmount;

	public BankAccount(double balance){
		this.balance = balance;
	}
	//throws an exception and uses the constructor that outputs a message using the specific balance.
	public void withdraw(double withdrawAmount) throws NegativeBalanceException{
		if (this.balance < withdrawAmount) {
			throw new NegativeBalanceException(withdrawAmount - this.balance);
		} else{
			this.balance -= withdrawAmount;
		}

	}
	//throws a generic exception
	public void quickWithdraw(double withdrawAmount) throws NegativeBalanceException {
		if(withdrawAmount > this.balance){
			throw new NegativeBalanceException();
		} else{
			this.balance -= withdrawAmount;
		}
	}

}
