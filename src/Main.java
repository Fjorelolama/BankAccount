
public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount("32145", 450.0, "Bob Sincley", "Myemail@bob.com", "+41 58 435 56 22");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

    }
}
