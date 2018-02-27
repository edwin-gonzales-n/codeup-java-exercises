import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        float decimals, volume;
        int userInput, area, perimeter, width, length;
        String firstWord , secondWord , thirdWord, sentence;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        userInput = sc.nextInt();
        System.out.print("Please enter a word: ");
        firstWord = sc.next();
        System.out.print("Please enter a word: ");
        secondWord = sc.next();
        System.out.print("Please enter a word: ");
        thirdWord = sc.next();
        System.out.print("Please enter a sentence: ");
        sentence = sc.next();
        sentence += sc.nextLine();

        System.out.println("You entered: --> \"" + userInput + " , " + firstWord + " , " + secondWord + " , " + thirdWord + " , and " + sentence + "\" <--");

        System.out.print("Please enter the width of Codeup's classroom: ");
        width = sc.nextInt();
        System.out.print("Please enter the length of Codeup's classroom: ");
        length = sc.nextInt();

        // You can use double for the classroom sizes as well, also Double.parseDouble(scanner.nextLine());

        area = width * length;
        perimeter = width + width + length + length;

        System.out.println("The are is : --> \"" + area + " , and the perimeter is: " + perimeter + "\" <--");

        System.out.print("Please enter a decimal number: ");
        decimals = sc.nextFloat();
        System.out.println("The decimal number is : --> \"" + decimals  + "\" <--");

        System.out.print("Please enter a side value of a room: ");
        volume = sc.nextFloat();
        volume = volume*volume*volume;
        System.out.println("The volume of the room is: --> \"" + volume  + "\" <--");








    }
}
