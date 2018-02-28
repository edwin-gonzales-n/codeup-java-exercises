import java.lang.Math;
import java.util.Scanner;

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
//        for (i = 1; i <=500; i*=2){
//            System.out.println((int) Math.pow(i,2));
//        }

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
        for (int x = 1; x <= userInput; x++){
            number = x;
            squared = (int)Math.pow(x,2);
            cubed = (int)Math.pow(x,3);
            System.out.printf("%6d%10d%10d\n", number,squared, cubed);
        }


    }
}