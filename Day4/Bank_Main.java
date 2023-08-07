package Day4;

abstract class BankAccount {
 protected double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public abstract void deposit(double amount);

 public abstract void withdraw(double amount);

 public double getBalance() {
     return balance;
 }
}

class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(double initialBalance, double interestRate) {
     super(initialBalance);
     this.interestRate = interestRate;
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount. Please deposit a positive value.");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid withdrawal amount.");
     }
 }

 public void addInterest() {
     balance += balance * interestRate;
     System.out.println("Interest added. New balance: " + balance);
 }
}

class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 public CurrentAccount(double initialBalance, double overdraftLimit) {
     super(initialBalance);
     this.overdraftLimit = overdraftLimit;
 }
 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount. Please deposit a positive value.");
     }
 }
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid withdrawal amount.");
     }
 }
}
public class Bank_Main {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
	     CurrentAccount currentAccount = new CurrentAccount(2000.0, 500.0);

	     savingsAccount.deposit(500.0);
	     savingsAccount.addInterest();
	     savingsAccount.withdraw(300.0);

	     currentAccount.withdraw(2300.0);
	     currentAccount.withdraw(300.0);
	     currentAccount.deposit(1000.0);

	     System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
	     System.out.println("Current Account Balance: " + currentAccount.getBalance());

	}

}
