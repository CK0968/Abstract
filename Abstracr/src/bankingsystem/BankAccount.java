package bankingsystem;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}