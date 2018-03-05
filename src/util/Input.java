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
        return scanner.nextInt();
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
        return scanner.nextDouble();
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
}
