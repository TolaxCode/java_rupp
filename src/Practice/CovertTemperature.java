package Practice;

import java.util.Scanner;

public class CovertTemperature {
    static void choose(){
        Scanner cin = new Scanner(System.in);
        int op,c,f;
        while (true){
            System.out.println("Choose temperature to covert ?");
            System.out.println("[1].C To F.");
            System.out.println("[2].F To C.");

            System.out.print("Input Temperature you want convert:");
            op = cin.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Input C :");
                    c = cin.nextInt();
                    f = (c * 9 / 5) + 32;
                    System.out.print(c + "C convert to F :" + f + "\n");

                }
                case 2 -> {

                    System.out.print("Input F :");
                    f = cin.nextInt();
                    c = (f - 32) * 5 / 9;
                    System.out.print(f + "F convert to C :" + c + "\n");
                }
                default -> {
                    System.out.println("Invalid.");
                }
            }
        }
    }
    public static void main(String[] args) {
        choose();
    }
}
