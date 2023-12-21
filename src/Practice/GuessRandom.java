package Practice;
import java.util.Random;
import java.util.Scanner;

public class GuessRandom {

    byte lifeMax = 3;
    int score = 0;

    Random random = new Random();
    static int userInput,max=50;
    int randomNumber = random.nextInt(max);
    char user;

    void conditionGame(){
        if(userInput>max){ //if user input bigger than max it return to check condition again
            System.out.println("Invalid.Please input under number 50.");
            return;
        }
        if(userInput>randomNumber){
            System.out.println("Too high.Try again!");
            lifeMax--;
            return;
        }
        if (userInput<randomNumber){
            System.out.println("Too low.Try again!");
            lifeMax--;
            return;
        }
        {
            System.out.println("Congratulation.You are right.");
            score+=10;
            System.out.println("Your Score : "+score);
            if(lifeMax>0 && lifeMax<3){
                lifeMax++;
            }
            randomNumber = random.nextInt(max);
            System.out.println("New random life :"+lifeMax);
            System.out.println("New random number :"+ randomNumber);
//            String showFirst = Integer.toString(randomNumber);
//            System.out.println(showFirst.charAt(0)+" dfd "+showFirst.charAt(1));
        }

    }

    public static void main(String[] args) {
        GuessRandom guessRandom = new GuessRandom();
        System.out.println(guessRandom.randomNumber);
        Scanner cin = new Scanner(System.in);
        while (true){
            System.out.println("===================================");
            System.out.println("Welcome to guessing random game.");
            System.out.println("===================================");
            System.out.println("     Your life : "+(guessRandom.lifeMax));
            System.out.println("===================================");


            if(guessRandom.lifeMax>=1 && guessRandom.lifeMax<=3){
                System.out.print("Input Number Your Guess rang ( 0 - 50 ) : ");
                userInput = cin.nextInt();
                guessRandom.conditionGame();
                continue; //if true continue to check pi top again
            }
            if(guessRandom.lifeMax==0){
                System.out.println("     Your score is : "+guessRandom.score);
                System.out.println("     You are lose.Try again.");
                System.out.println("===================================");
                System.out.print("Choose options to continue [y for Yes] or [n for No] : ");
                guessRandom.user = cin.next().charAt(0);
                if(guessRandom.user=='y'){
                    guessRandom.score = 0; // new score
                    guessRandom.lifeMax = 3; //new life
                    continue;
                }
                if (guessRandom.user=='n'){
                    System.out.println("Exit game.");
                    break; //stop
                }
            }

        }

    }
}
