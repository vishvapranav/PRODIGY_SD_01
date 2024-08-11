package PRODIGY;

import java.util.Random;
import java.util.Scanner;

public class SD_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Generate random number 1 to 100
        Random random=new Random();
        int randomno=random.nextInt(100);
        int attempts=0;
       // System.out.println(randomno);

        System.out.println("GUESS THE NUMBER(1 to 100)");
        boolean guessedcorrectly = false;

        while (! guessedcorrectly) {
            //Get the number from the user
            System.out.println("Enter the number:");
            int input=sc.nextInt();
            if (input>randomno) {
                System.out.println("The guessed number is too high");
                attempts++;
                System.out.println("Guess again");
            }
            else if (input<randomno){
                System.out.println("The guessed number is too low");
                attempts++;
                System.out.println("Guess again");
            }
            else {
                guessedcorrectly=true;
                System.out.println("Congratulations!!");
                System.out.println("You have guessed the number correctly");
                System.out.println("No of attempts "+attempts);
            }
        }
        sc.close();
    }
}
