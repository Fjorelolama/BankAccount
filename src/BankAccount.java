public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customPhoneNumber;

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.accountBalance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomPhoneNumber() {
        return customPhoneNumber;
    }

    public void setCustomPhoneNumber(String customPhoneNumber) {
        this.customPhoneNumber = customPhoneNumber;
    }
}
