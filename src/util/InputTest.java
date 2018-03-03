package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

        boolean string1 = in.yesNo("Hello would you like to run this app?");
        if (string1){
            int num1 = in.getInt(1,10,"Please enter a number between 1 and 10:");
            System.out.println("You entered the number " + "'" + num1 + "'");
            double double1 = in.getDouble(1.0,100.0, "Please enter a decimal from 1.0 to 100.0");
            System.out.println("You entered the decimal " + "'" + double1 + "'");
        } else
            System.exit(0);
    }
}
