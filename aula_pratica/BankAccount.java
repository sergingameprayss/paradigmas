package aula_pratica;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private double limit;

    
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null){
            this.accountNumber = accountNumber;
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void setLimit(double limit) {
        if (limit >= 0 && limit <= this.balance) {
            this.limit = limit;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the current balance.");
        }
    }
}
