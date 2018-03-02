package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input();
        int userInputA;
        int userInputB;
        double doubleInputA;
        double doubleInputB;
        String userOption;

        System.out.println("Hello, would you like to use this program??");
        userOption = sc.next();
        in.setyesNo(userOption);
        System.out.println("You want to continue, and that is " + in.getyesNo());

        System.out.println("Enter a min and max integer: ");
        userInputA = sc.nextInt();
        userInputB = sc.nextInt();
        //call getIn(min,max)
        System.out.println(in.getInteger(userInputA,userInputB));

        System.out.println("Enter a min and max double: ");
        doubleInputA = sc.nextDouble();
        doubleInputB = sc.nextDouble();
        //call getIn(min,max)
        System.out.println(in.getIamDouble(doubleInputA,doubleInputB));









    }
}
