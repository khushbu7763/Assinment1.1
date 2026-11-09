
public class BankAccount {

    private int accountNumber;
    private double balance;

    static int totalAccounts = 0;


    // constructor
    public BankAccount(double balance) {
        totalAccounts++;
        accountNumber = totalAccounts;
        this.balance = balance;
    }

    // deposit money
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // get balance
    public double getBalance() {
        return balance;
    }

    // static method
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(20000);

        account1.deposit(7000);
        account2.withdraw(11000);

        System.out.println("Account " + account1.getAccountNumber()
                + " balance: " + account1.getBalance());

        System.out.println("Account " + account2.getAccountNumber()
                + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: "
                + BankAccount.getTotalAccounts());
    }
}
