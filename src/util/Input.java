package util;
import java.util.Scanner;
import java.util.Random;

public class Input {
    private String scanner;
    private String string;
    private boolean yesNo;
    private int integer;
    private double IamDouble;

    public int getInteger(int min, int max){
        do{
            System.out.println("Try again!");
            System.out.println("Please enter the correct order of numbers, min and max.");
            break;
        }while(min > max || max < min);
        return min + max;
    }
    public int getInteger(){
        return integer;
    }
    public double getIamDouble(double min, double max){
        return min + max;
    }
    public double getIamDouble(){
        return IamDouble;
    }
    //Boolean stuff
    public boolean setyesNo(String input){
        if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
            return yesNo = true;
        } else return false;
    }
    public boolean getyesNo() {
        return yesNo;
    }
}
