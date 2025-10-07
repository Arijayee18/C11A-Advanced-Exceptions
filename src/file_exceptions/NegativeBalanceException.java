package file_exceptions;
import java.io.*;       // for File and PrintWriter


public class NegativeBalanceException extends Exception{
	double negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceException(double negativeBalance){
		super("Amount exceeds balance by "+ negativeBalance);      
		this.negativeBalance = negativeBalance;
		try {      
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
