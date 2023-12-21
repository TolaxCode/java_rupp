package Practice;
import java.util.Scanner;

public class VendingMachine {
    static final String[] products = {"Coca","Pepsi","Milk","Water"};
    static final float[] prices ={1.25f,1.25f,2.50f,0.50f};
    static final int[] stocks = {5,5,5,5};
    static float  balance = 10.00f;
    static int choise;
    static Scanner cin = new Scanner(System.in);

    static void display(){
        System.out.println("       Vending Machine.");
        System.out.println("================================");
        for(int i=0; i<products.length; i++){
            System.out.println(" "+(i+1) +" . "+products[i]+"    $"+ prices[i]);
        }
        System.out.println("================================");
    }

    static void payAmount(int index){
        float kh =0;
        System.out.println(products[index]+" was order.");
        stocks[index]--;  //stocks[index]-1;
        balance-=prices[index]; // balance = balance - prices[index]
       // kh = prices[index] * 4100;
       // System.out.println("Price Riel   : r"+kh);
        System.out.println("Price : $"+prices[index]);
        System.out.println("Your balance is : $"+balance);
       // System.out.println("Your balance is : r"+balance*4100);

    }

    static void process(int index){
        if(stocks[index]<0){
            System.out.println("Product is empty.Please choose other products.");
            return;
        }
        if(balance<prices[index]){
            System.out.println("Your balance is not enough $"+balance);
            return;
        }
        {
            payAmount(index);
        }
    }

    public static void main(String[] args) {
        while (true){
            display();
            System.out.print("Choose product : ");
            choise = cin.nextInt();

            if(choise>=1 && choise<=products.length){
                process(choise-1);
            }
            if(choise<=0 || choise>products.length){
                System.out.println("Invalid choose.Please choose again!");
            }

        }
    }
}
