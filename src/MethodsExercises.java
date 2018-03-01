import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        addition(10,8);
        subtraction(50,100);
        multiplication(10,10);
        division(1000,56);
        modulus(60,24);
//        factorial(4);

        int userInput;
        int otherInput;
        String userquits;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a min number between 1 and 10: ");
        userInput = sc.nextInt();
        System.out.print("Please enter a max number between 1 and 10: ");
        otherInput = sc.nextInt();
        getInteger(userInput,otherInput);

        System.out.print("Would you like to continue? (yes) :");
        userquits = sc.next();
        if (userquits.equalsIgnoreCase("yes") || userquits.equalsIgnoreCase("y")){
            System.out.print("Please enter a number between 1 and 10 to be factored: ");
            userInput = sc.nextInt();
            while (userInput > 10 || userInput < 1) {
                System.out.print("Please enter a number between 1 and 10, " + "'"+userInput+"'" + " is not valid:");
                userInput = sc.nextInt();
            }
            factorial(userInput);
        } else System.out.println("Thank you for using my program!");

        System.out.println("Now we are going to play dice rolling!!");
        System.out.print("Enter a number between 1 and 6 of the side on dice 1: ");
        userInput = sc.nextInt();
        while(userInput > 6 || userInput < 1) {
            System.out.print("Please enter a number between 1 and 6, " + "'"+userInput+"'" + " is not valid:");
            userInput = sc.nextInt();
        }
        System.out.print("Enter a number between 1 and 6 of the side on dice 2: ");
        userInput = sc.nextInt();
        while(userInput > 6 || userInput < 1){
            System.out.print("Please enter a number between 1 and 6, " + "'"+userInput+"'" + " is not valid:");
            userInput = sc.nextInt();
        }
        int random1 =diceRoll();
        int random2 = diceRoll();
        int sumRandom = random1 + random2;
        System.out.println("ROLLING!!!\n" +
                "......................\n" +
                "......................");
        System.out.println("The result of dice 1 is:  " + random1);
        System.out.println("The result of dice 2 is:  " + random2);
        System.out.println("Together they are a sum of:  " + sumRandom);



    }

    // MY FUNCTIONS
    public static void addition(int a, int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
    public static void subtraction(int a, int b){
        int sub = b - a;
        System.out.println(b + " - " + a + " = " + sub);
    }
    public static void multiplication(int a, int b){
        int mul = a * b;
        System.out.println(a + " * " + b + " = " + mul);
    }
    public static void division(int a, int b){
        int div = a/b;
        System.out.println(a + " / " + b + " = " + div);
    }
    public static void modulus(int a, int b){
        int mod = a%b;
        System.out.println(a + " % " + b + " = " + mod);
    }
    public static void getInteger(int min, int max){
        if (min < 1 || max > 10){
            System.out.print("please enter a number between 1 and 10");
        } else System.out.println("You entered: " + min + " and: " + max);
    }
    public static void factorial(int input){
        int fact = 1;
        System.out.println("The factorial result of " + input + " is:");
        for (int i = 1; i <= input; i++){
           fact *= i;
            System.out.println(" " + fact);
        }
    }
    public static int diceRoll(){
        Random rand = new Random();
        int  n = rand.nextInt(6) + 1;
        return n;
    }

}
