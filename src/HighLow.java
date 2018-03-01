import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int  n = rand.nextInt(100) + 1; //picks a random number between 1 and 100
        int userGuesses = 0; //declares the counter for user guesses starting at 0
        String userExit;

        // Welcome message
        System.out.println("\nHello, and welcome to the 'Guess the Number' game\n" +
                "The number is between 1 and 100 so good luck!\n" +
                "YOU HAVE UP TO 10 GUESSES TO GET IT RIGHT!\n" +
                "Brought to you by the creators of GYG Productions!\n");

        // Ask the user to play
        System.out.println("Would you like to play ?");
        userExit = sc.next();
        //while loop that starts if the user answers yes
        while(userExit.equals("yes") || userExit.equals("y")) {
            letsPlay(n);
            userGuesses++;
            System.out.println("Guesses: " + userGuesses);
            if(userGuesses == 10){
                System.out.println("GAME OVER KID!!!");
                System.exit(0);
            }
        }
        //if the user says no, then we will thank the user and exit the program
        if(userExit.equals("no") || userExit.equals("n")){
            System.out.println("Thank you for playing!!  Bye!\n");
            System.exit(0);
        }
    }

    // functions go here
        public static void letsPlay(int n){
            Scanner sc = new Scanner(System.in); //Scanner had to be called in this method, otherwise it wouldnt work
            System.out.println("I got a number, guess the number: ");
            int userInput = sc.nextInt();
            // if statement for logic
            if (userInput == n) {
                System.out.println("YES...GOOD GUESS!!\n");
                System.out.println("Would you like to play again?");
                String userExit = sc.next();
                        if(userExit.equals("yes") || userExit.equals("y")){
                            letsPlay(n);  // if user decides to play again we are calling back the method
                        } else if(userExit.equals("n") || userExit.equals("no")){
                            System.out.println("Thank you for playing!!\n");
                            System.exit(0); // exit the program if user answers no
                        }
            } else if(userInput < n){
                System.out.println("Nope....HIGHER!");
            } else if(userInput > n){
                System.out.println("Nope....LOWER!");
            } else System.exit(0);
        }
}