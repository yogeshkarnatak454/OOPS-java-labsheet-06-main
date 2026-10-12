class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    void showBalance() {
        System.out.printf("Balance: %.2f%n", balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else if (balance - amount < 100) {
            System.out.println("Withdrawal denied: balance cannot fall below 100");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class Q05_BankAccountSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.deposit(100);
        account.withdraw(450);
        account.withdraw(200);
        account.showBalance();
    }
}
