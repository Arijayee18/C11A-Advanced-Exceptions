/* Authors: Ethan Kleiber and AriJaye Derritt 
 * This class is the driver class. It handles exceptions and withdraws from the bank
 * 
 * */
public class ATM {
	private BankAccount balance;

	//Makes the basic bankaccount with $500
	public ATM() {
		this.balance = new BankAccount(500);
	}
	
	public void handleTransactions() throws Exception{
		//handle the negative exception with the actually paramaterized exception handling
		try {
			this.balance.withdraw(600.00);
		} catch (Exception e){    
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		//handle the negative exception with no specific balance handling
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
