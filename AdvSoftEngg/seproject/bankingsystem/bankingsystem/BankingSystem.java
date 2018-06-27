package bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount("RB034746", "Rakesh", 27, "Male");
        Account currentAccount = new CurrentAccount("YB04567", "yogesh", 35, "Male");


             savingAccount.deposit(120);
             savingAccount.deposit(1340);
             savingAccount.deposit(120);

             savingAccount.calculateInterest();

             currentAccount.deposit(7500);
             currentAccount.deposit(1230);
             currentAccount.withdraw(1010);
   }
}


