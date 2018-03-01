import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//        Use the random method of the java.lang.Math class to generate a random number.
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;
        int userGuesses = 0;
        String userExit;
        // System calls for user
        System.out.println("\nHello, and welcome to the 'Guess the Number' game\n" +
                "The number is between 1 and 100 so good luck!\n" +
                "YOU HAVE UP TO 10 GUESSES TO GET IT RIGHT!" +
                "Brought to you by the creators of DJ Gonzo Productions!\n");
        System.out.println("Would you like to play ?");
        userExit = sc.next();
        while(userExit.equals("yes") || userExit.equals("y")) {
            letsPlay(n);
            userGuesses++;
            System.out.println("Guesses: " + userGuesses);
            if(userGuesses == 10){
                System.out.println("GAME OVER KID!!!");
                System.exit(0);
            }
        }
        if(userExit.equals("no") || userExit.equals("n")){
            System.out.println("Thank you for playing!!  Bye!\n");
            System.exit(0);
        }
    }
    // functions go here
        public static void letsPlay(int n){
            Scanner sc = new Scanner(System.in);
            System.out.println("I got a number, guess what number it is: ");
            int userInput = sc.nextInt();
            if (userInput == n) {
                System.out.println("WOW...GOOD GUESS!!\n");
                System.out.println("Would you like to play again?");
                String userExit = sc.next();
                        if(userExit.equals("yes") || userExit.equals("y")){
                            letsPlay(n);
                        } else if(userExit.equals("n") || userExit.equals("no")){
                            System.out.println("Thank you for playing!!\n");
                            System.exit(0);
                        }
            } else if(userInput < n){
                System.out.println("Nope....HIGHER!");
            } else if(userInput > n){
                System.out.println("Nope....LOWER!");
            } else System.exit(0);
        }
}
