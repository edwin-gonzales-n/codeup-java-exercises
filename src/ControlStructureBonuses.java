import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class ControlStructureBonuses {
    public static void main(String[] args) {
        int userInteger;
        int i; // counter for "for loop"
        String[] daysArray = {"test", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 7: ");
        userInteger = sc.nextInt();
        do{
            System.out.println("Please enter a valid number: ");
            userInteger = sc.nextInt();
        }while(userInteger == 0 || userInteger > 7);
        String dayOfWeek = daysArray[userInteger];
        System.out.println("That number corresponds to the day: " + dayOfWeek);
    }
}