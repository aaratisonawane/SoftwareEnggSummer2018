package bankingsystem;

abstract class Account {
    private String accountID;
    private String name;
    private int age;
    private String gender;
    private double accountBalance;

    public Account(String accountID, String name, int age, String gender) {
        this.accountID = accountID;
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getAccountID() {
        return accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    abstract void calculateInterest();
}