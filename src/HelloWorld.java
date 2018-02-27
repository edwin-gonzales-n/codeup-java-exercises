import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
        System.out.println("You should indent your code");
        System.out.println("Whazaaaaaa");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "GYG";
        myString = "3.14159";  // with quotes work, but not without.
        System.out.println(myString);

        double myNumber = 123L;   // for 3.14 must be data type double.   WIth 123L just prints the number
        myNumber = 123.1;
        System.out.println(myNumber); // variable number might not have been initialized

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);
//
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}


