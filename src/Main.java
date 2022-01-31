
public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setAccountNumber("88773");
        bobsAccount.setAccountBalance(4500.0);
        bobsAccount.setCustomerName("Bob Sincler");
        bobsAccount.setCustomPhoneNumber("+41 584 332 34");

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

    }
}
