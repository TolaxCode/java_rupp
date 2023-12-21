package Practice;
import java.util.Scanner;

public class Calculator {

    static String [] nameOperator = {"Sum","Subtraction","Divide","Multiply","Module"};
    String [] labelOperator = {"+","-","/","*","%"};

    int [] operator = {0,1,2,3,4,5};

    static float x,y,total;
    void display(){
        System.out.println("========Calculator==========");
        for(int i=0; i<nameOperator.length; i++){
            System.out.println("\t"+(i+1)+". ["+(labelOperator[i])+"]  "+nameOperator[i]);
        }
        System.out.println("============================");
    }
    Scanner cin = new Scanner(System.in);
    void input(){
        System.out.print("Enter number x : ");
        x = cin.nextFloat();
        System.out.print("Enter number y : ");
        y = cin.nextFloat();
    }
    void sum(){
        total = x + y;
    }
    void sub(){
        total = x - y;
    }
    void divide(){
        total = x / y;
    }
    void multiply(){
        total = x * y;
    }
    void module(){
        total = x % y;
    }

    void chooseOperator(int userInput){
        if(userInput==operator[1]){
            sum();
        }
        if(userInput==operator[2]){
            sub();
        }
        if(userInput==operator[3]){
            divide();
        }
        if(userInput==operator[4]){
            multiply();
        }
        if(userInput==operator[5]){
            module();
        }
        System.out.println("Result : "+total);

    }



    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true){
            int userInput;
            calculator.display();
            calculator.input();
            System.out.print("Choose Operator : ");
            userInput = cin.nextInt();
            {
                calculator.chooseOperator(userInput);
            }
        }
    }
}
