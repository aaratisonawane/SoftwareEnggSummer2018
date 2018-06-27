package bankingsystem;

class SavingAccount extends Account {
    private static boolean firstTime = true;
    private static final double INTEREST_RATE = 0.05;


    public SavingAccount(String accountID, String name, int age, String gender) {
        super(accountID, name, age, gender);
    }

    @Override
    public void deposit(double amount) {
        System.out.println();
        System.out.println("***   Deposit in SavingAccount in progress   ***");
        System.out.println();
        if (firstTime == true) {
            if (amount < 1000) {
                System.out.println("Sorry you can't deposit a amount which is less than 1000$ at first Time");
            } else {
                super.deposit(amount);
                System.out.println("Successfully Deposited " + amount + "$ on this account : " + getAccountID());
                firstTime = false;
            }
        } else {
            super.deposit(amount);
            System.out.println("Successfully Deposited " + amount + "$ on this account : " + getAccountID());

        }
        System.out.println();
        System.out.println("***   Deposit completed.   ***");
        System.out.println();
        System.out.println();

    }

    @Override
    public void withdraw(double amount) {
        System.out.println();
        System.out.println("***   Withdrawal in SavingAccount is in-progress   ***");
        System.out.println();
        double tempBalance = getAccountBalance() - amount;

        if (tempBalance <= 500) {
            System.out.println("Sorry You can't withdraw this amount of Money!");
        } else {
            withdraw(amount);
            System.out.println("Sucessfully Withdraw " + amount + " $ from this account : " + getAccountID());
        }
        System.out.println();
        System.out.println("***  Withdrawal completed.   ***");
        System.out.println();
        System.out.println();
    }

    @Override
    void calculateInterest() {
        double interestAmount = getAccountBalance() * INTEREST_RATE;
        double totalBalance = getAccountBalance() + interestAmount;
        setAccountBalance(totalBalance);
        System.out.println("Your  Interest Amount : " + interestAmount);
        System.out.println();

    }


}