package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = getString();
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        } else return false;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }
    // int
    public int getInt(){
        try{
            return Integer.valueOf(scanner.next());
        }catch (NumberFormatException NumberFormatException){
            System.err.println("Exception " + NumberFormatException);
            scanner.nextLine();
            System.out.println("Input must be a whole number:");
            return getInt();
        }
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max){
        int userInput = getInt();
        if(userInput < min || userInput > max){
            System.out.println("Invalid number!  Try again!");
            return getInt(min,max);
        } else
            return userInput;
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        return getInt(min,max);
    }
    // double
    public double getDouble(){
        try{
            return Double.valueOf(scanner.next());
        }catch (NumberFormatException NumberFormatException){
            System.err.println("Exception " + NumberFormatException);
            scanner.nextLine();
            System.out.println("Input must be a 'double' (decimal) number:");
            return getDouble();
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max){
        double userInput = getDouble();
        if(userInput < min || userInput > max){
            System.out.println("Invalid decimal!  Try again!");
            return getDouble(min,max);
        } else return userInput;
    }
    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min,max);
    }

    public int getBinary(){
        try{
            return Integer.valueOf(scanner.next(), 2);
        }catch (NumberFormatException NumberFormatException){
            System.err.println("Exception " + NumberFormatException);
            scanner.nextLine();
            System.out.println("Input must be a binary number:");
            return getBinary();
        }
    }

    public int getHex(){
        try{
            return Integer.valueOf(scanner.next(), 16);
        }catch (NumberFormatException NumberFormatException){
            System.err.println("Exception " + NumberFormatException);
            scanner.nextLine();
            System.out.println("Input must be a Hex number:");
            return getBinary();
        }
    }



}
