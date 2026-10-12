abstract class BankAccount {
    protected double balance;

    BankAccount(double openingBalance) {
        balance = Math.max(0, openingBalance);
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.printf("Balance: %.2f%n", balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double openingBalance) {
        super(openingBalance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Savings withdrawal successful");
        } else {
            System.out.println("Savings withdrawal denied; keep at least 100 in the account");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(double openingBalance, double overdraftLimit) {
        super(openingBalance);
        this.overdraftLimit = Math.max(0, overdraftLimit);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current account deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Current account withdrawal successful");
        } else {
            System.out.println("Withdrawal denied; overdraft limit exceeded");
        }
    }
}

public class Q08_AbstractBankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(550);
        savings.showBalance();

        CurrentAccount current = new CurrentAccount(500, 1000);
        current.withdraw(1200);
        current.showBalance();
    }
}
