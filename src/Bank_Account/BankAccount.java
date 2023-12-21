package Bank_Account;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final String customerName;
    private final String email;
    private final String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your deposit : $"+amount+"\nYour balance now is : $"+balance);
        }
        displayDetail();
    }

    public void withDraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Your withdraw : $"+amount+"\nYour balance now is : $"+balance);
        }
        displayDetail();
    }
    void displayDetail(){
        System.out.println("********Account Detail********");
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : $" +balance);
        System.out.println("Customer name : "+customerName);
        System.out.println("Email : "+email);
        System.out.println("Phone number : "+phoneNumber);
        System.out.println("*******************************");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
                "alex100",
                1500,
                "Alex",
                "alex100@gmail.com",
                "0106666"
        );
        bankAccount.displayDetail();
        bankAccount.deposit(300);
        bankAccount.withDraw(1200);

    }
}
