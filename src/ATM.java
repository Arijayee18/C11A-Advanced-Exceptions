
public class ATM {
	private BankAccount balance;

	public ATM() {
		this.balance = new BankAccount(500);
	}

	public void handleTransactions() throws Exception{
		try {
			this.balance.withdraw(600.00);
		} catch (Exception e){    
			System.out.println(e);
			System.out.println(e.getMessage());
		}

		try {
			this.balance.quickWithdraw(600.0);
		}catch (Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		atm.handleTransactions();
	}

}
