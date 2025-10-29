package bankingsystem;

import javax.swing.JOptionPane;

public class Main {
	 public static void main(String[] args) {
	        SavingsAccount account = new SavingsAccount();
	        
	        
	        String depositStr = JOptionPane.showInputDialog("Enter deposit amount:");
	        double depositAmount = Double.parseDouble(depositStr);
	        account.deposit(depositAmount);
	        
	        
	        String withdrawStr = JOptionPane.showInputDialog("Enter withdraw amount:");
	        double withdrawAmount = Double.parseDouble(withdrawStr);
	        account.withdraw(withdrawAmount);
	    }
	}

