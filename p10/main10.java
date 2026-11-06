class BankAccount {

    // Private Fields
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    // Getter Methods
    String getAccountHolder() {
        return accountHolder;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    // Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Creating BankAccount Object
        BankAccount b = new BankAccount("Rahul", 101, 5000);

        // Display Account Details
        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Initial Balance: " + b.getBalance());

        System.out.println("\n--- Transactions ---");

        // Valid Deposit
        b.deposit(2000);

        // Invalid Deposit
        b.deposit(-500);

        // Valid Withdrawal
        b.withdraw(1000);

        // Invalid Withdrawal
        b.withdraw(0);

        // Negative Withdrawal
        b.withdraw(-200);

        // Withdrawal Greater Than Balance
        b.withdraw(10000);

        // Updated Balance
        System.out.println("\nUpdated Balance: " + b.getBalance());
    }
}
