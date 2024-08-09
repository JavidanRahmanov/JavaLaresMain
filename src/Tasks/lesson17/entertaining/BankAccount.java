package Tasks.lesson17.entertaining;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   public double depositAmount(double amount){
        return balance+=amount;
    }
    public double withdrawAmount(double amount) throws InsufficientFundsException{
        if(balance - amount<0)
            throw new InsufficientFundsException("Balance is negative!");
        return balance-=amount;
    }

    public BankAccount() {

    }

    public void transferFunds(BankAccount account1, BankAccount account2, double amount) throws InsufficientFundsException {

        System.out.println("Balance: " + account1.withdrawAmount(amount));
        System.out.println("Balance: "+  account2.depositAmount(amount));
    }
}
