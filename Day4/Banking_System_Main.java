package Day4;
import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    double getBalance();
}

class SavingsAccountBank implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccountBank(double initialBalance, double interestRate) {
        this.balance = initialBalance;
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

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CurrentAccountBank implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccountBank(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
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

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Bank Accounts:");
        for (Account account : accounts) {
            System.out.println("Account Balance: " + account.getBalance());
        }
    }
}

public class Banking_System_Main {

	public static void main(String[] args) {
		Bank bank = new Bank();

        SavingsAccountBank savingsAccount = new SavingsAccountBank(1000.0, 0.05);
        CurrentAccountBank currentAccount = new CurrentAccountBank(2000.0, 500.0);
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Perform operations on accounts
        savingsAccount.deposit(500.0);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(300.0);

        currentAccount.withdraw(2300.0);
        currentAccount.deposit(1000.0);

        // Display account details
        bank.displayAccounts();

	}

}
