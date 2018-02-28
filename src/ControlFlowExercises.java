import java.lang.Math;
import java.util.Scanner;
//import java.math.BigInteger;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 0;

//        while (i <= 15){
//            System.out.print(" " + i++);
//        }

//        do {
//            System.out.print(i);
//            i+=2;
//        } while(i<102);
//        int  i = 100;
        int i;
//            for (i = 100; i >= -10; i-=5){
//                System.out.printf("%d ",i);
//            }
//        do {
//            System.out.printf("%d ", i);
//            i-=5;
//        } while(i >= -10);

//        do{
//            System.out.println((int) Math.pow(i,2));
//            i*=2;
//        }while(i <= 500);
        for (i = 2; i <=100000; i=(int) Math.pow(i,2)){
            System.out.println(i);
        }
//        x = x.multiply(x)

        // ### Fizz Buzz
//        for (i = 1; i <=100; i++){
//            if (i%3 == 0 && i%5 == 0){
//                System.out.println("FizzBuzz: " + i);
//            } else if (i%3 ==0) {
//                System.out.println("Fizz: " + i);
//            } else if (i%5 ==0){
//                System.out.println("Buzz: " + i);
//            } else {
//                System.out.println(i);
//            }
//        }

        // #### TABLE OF POWERS #####
        int userInput;
        int number;
        int squared;
        int cubed;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        userInput = sc.nextInt();
        System.out.printf("%5s%10s%10s\n", "number","squared", "cubed" );
        for (int x = 1; x <= userInput; x++) {
            number = x;
            squared = (int) Math.pow(x, 2);
            cubed = (int) Math.pow(x, 3);
            System.out.printf("%6d%10d%10d\n", number, squared, cubed);
        }
        System.out.print("Would you like to continue?: ");
        String firstWord = sc.next();
        if (firstWord.equalsIgnoreCase("yes") || firstWord.equalsIgnoreCase("y")  ){
            System.out.print("Please enter a random school grade: ");
            int firstGrade = sc.nextInt();
            if (firstGrade == 100 || firstGrade == 99) {
                System.out.println("Your school grade is an A+ ! ");
            } else if (firstGrade <= 98 && firstGrade >= 88){
                System.out.println("Your school grade is an A! ");
            } else if (firstGrade <= 87 && firstGrade >= 80){
                System.out.println("Your school grade is an B! ");
            } else if (firstGrade <= 79 && firstGrade >= 67){
                System.out.println("Your school grade is an C! ");
            } else if (firstGrade <= 66 && firstGrade >= 60){
                System.out.println("Your school grade is an D! ");
            } else if (firstGrade <= 59 && firstGrade >= 0){
                System.out.println("Your school grade is an F! ");
            }
        } else if (firstWord.equalsIgnoreCase("no") || firstWord.equalsIgnoreCase("n")){
            System.out.println("Thank you!  --  Bye Bye!!");
            System.exit(0);
        }
        System.out.print("Would you like to continue?: ");
        String secondPrompt= sc.next();
        if (secondPrompt.equalsIgnoreCase("yes") || secondPrompt.equalsIgnoreCase("y")  ) {
            System.out.println("Well, this program is over, but keep coming");
            System.exit(0);
        } else System.exit(0);
    }
}