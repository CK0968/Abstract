package bankingsystem;

import javax.swing.JOptionPane;

class SavingsAccount implements BankAccount {
    private double balance = 0;
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(null, "Deposited: " + amount + ", Balance: " + balance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            JOptionPane.showMessageDialog(null, "Withdrew: " + amount + ", Balance: " + balance);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds!");
        }
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
}