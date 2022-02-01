
public class Main {

    public static void main(String[] args) {

        //BankAccount bobsAccount = new BankAccount("32145", 450.0, "Bob Sincley", "Myemail@bob.com", "+41 58 435 56 22");

        //System.out.println(bobsAccount.getAccountNumber());
        //System.out.println(bobsAccount.getAccountBalance());

        //bobsAccount.deposit(50.0);
        //bobsAccount.withdrawal(100.0);

        //bobsAccount.deposit(51.0);
        //bobsAccount.withdrawal(100.0);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());



    }
}
