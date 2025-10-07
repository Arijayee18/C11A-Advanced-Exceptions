/* Authors: Ethan Kleiber and AriJaye Derritt 
 * This class handles what actually happens when the custom exception
 * is called to handle negative balances during withdraws. It handles
 * the output to the terminal along with to the logfile.txt file.
 * 
 * */
package file_exceptions;
import java.io.*;       // for File and PrintWriter


public class NegativeBalanceException extends Exception{
	double negativeBalance;
	
	//Setting up the default exception that doesn't take in a balance
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	//Setting up the actual negative balance exception that takes in a balance
	public NegativeBalanceException(double negativeBalance){
		super("Amount exceeds balance by "+ negativeBalance);      
		this.negativeBalance = negativeBalance;
		try {      
			//Setting up and using the printWriter to write to the logfile.txt
			PrintWriter out = new PrintWriter("logfile.txt");
			out.println("Amount exceeds balance by "+ negativeBalance);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public String toString() {
		return "Balance of " + this.negativeBalance + " not allowed.";
	}
	
	
}
