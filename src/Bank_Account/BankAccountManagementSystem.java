package Bank_Account;

import java.util.Scanner;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(
                "john200",
                5000,
                "John",
                "john200@gmail.com",
                "010-897-887"
        );
        bankAccount.displayDetail();

        while (true){
            System.out.println("*********OPTIONS**********");
            System.out.println("[1].Deposit.");
            System.out.println("[2].Withdraw.");
            System.out.println("[3].View detail.");
            System.out.println("[4].Exit.");
            System.out.println("**************************");
            System.out.print("Choose option : ");
            int op = cin.nextInt();
            switch (op){
                case 1 :{
                    System.out.print("Input amount to deposit : $");
                    double depositAmount = cin.nextInt();
                    bankAccount.deposit(depositAmount);
                    break;
                }
                case 2:{
                    System.out.print("Input amount to withdraw : $");
                    double withdrawAmount = cin.nextInt();
                    bankAccount.deposit(withdrawAmount);
                    break;
                }
                case 3:{
                    bankAccount.displayDetail();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid input.");
                }
            }

        }
    }
}
