package bankingsystem;

class CurrentAccount extends Account {
    private static boolean firstTime = true;

    public CurrentAccount(String accountID, String name, int age, String gender) {
        super(accountID, name, age, gender);
    }


    @Override
    public void deposit(double amount) {
        System.out.println();
        System.out.println("***   Deposit in CurrentAccount in progress   ***");
        System.out.println();
        if (firstTime == true) {
            if (amount < 5000) {
                System.out.println("Sorry you can't deposit a amount which is less than 5000 $ at first Time");
            } else {
                super.deposit(amount);
                System.out.println("Successfully Deposited " + amount + " $ on this account : " + getAccountID());
                firstTime = false;
            }

        } else {
            super.deposit(amount);
            System.out.println("Successfully Deposited " + amount + " $ on this account : " + getAccountID());
        }
        System.out.println();
        System.out.println("***   Deposit completed.   ***");
        System.out.println();
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println();
        System.out.println("***   Withdrawal in CurrentAccount is in-progress   ***");
        System.out.println();
        double tempBalance = getAccountBalance() - amount;

        if (tempBalance < 0) {
            System.out.println("Sorry You can't withdraw this amount  of Money!");
        } else {
            super.withdraw(amount);
            System.out.println("Sucessfully Withdraw " + amount + " taka from this account : " + getAccountID());
        }
        System.out.println();
        System.out.println("***   Withdrawal completed.   ***");
        System.out.println();
        System.out.println();
    }

    @Override
    void calculateInterest() {
    }

}
