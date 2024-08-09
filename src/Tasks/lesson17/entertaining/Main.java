package Tasks.lesson17.entertaining;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(302232,"Cavidan",250);
        BankAccount account2 = new BankAccount(343254,"Cahan",350);
        BankAccount account3 = new BankAccount(343554,"Oqtay",450);
        BankAccount account = new BankAccount();

        account1.depositAmount(25);

        try {
            System.out.println(account1.withdrawAmount(250));
            account.transferFunds(account1,account2,45);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
