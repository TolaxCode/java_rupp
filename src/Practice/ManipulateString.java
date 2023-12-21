package Practice;


import java.util.Locale;
import java.util.Scanner;

public class ManipulateString {
    static void display(){
        System.out.println("===================================================");
        System.out.println(" 1. Count the number of characters in the sentence.");
        System.out.println(" 2. Count the number of words in the sentence.");
        System.out.println(" 3. Convert the sentence to uppercase.");
        System.out.println(" 4. Convert the sentence to lowercase.");
        System.out.println(" 5. Exit");
        System.out.println("===================================================");
    }

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        String userInput;
        int choise;
        System.out.print("Enter your sentence : ");
        userInput = cin.nextLine();
        while (true){
            display();
            System.out.print("Choose choise : ");
            choise = cin.nextInt();

            if(choise==1){
                System.out.println("Length :"+userInput.length());
            }
            else if(choise==2){
                String[] word = userInput.split("\\s+"); // to cut space
                int count = word.length;
                System.out.println("Word : "+count);
            }
            else if(choise==3){
                System.out.println("Covert to uppercase : "+userInput.toUpperCase());
            }
            else if(choise==4){
                System.out.println("Covert to lowercase : "+userInput.toLowerCase());
            }else {
                break;
            }

        }
    }

}
