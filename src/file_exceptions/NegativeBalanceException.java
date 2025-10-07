package file_exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;       // for File and PrintWriter
import java.util.*;     // for Scanner


public class NegativeBalanceException extends Exception{
	double negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	public NegativeBalanceException(double negativeBalance){
		super("Amount exceeds balance by "+ negativeBalance);
		this.negativeBalance = negativeBalance;
		//PrintWriter out = new PrintWriter("logfile.txt");
	}
	
	
}
