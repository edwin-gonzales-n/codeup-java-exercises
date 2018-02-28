import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class ControlStructureBonuses {
    public static void main(String[] args) {
        int userInteger;
        int i; // counter for "for loop"
        String userName;
        String[] daysArray = {"test", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 7: ");
        userInteger = sc.nextInt();
        while(userInteger == 0 || userInteger > 7){
            System.out.println("Please enter a valid number: ");
            userInteger = sc.nextInt();
        }
        String dayOfWeek = daysArray[userInteger];
        System.out.println("That number corresponds to the day: " + dayOfWeek);

        // PRIME
        System.out.print("Please enter a random number to check for primes: ");
        userInteger = sc.nextInt();
        checkPrime(userInteger);

        System.out.print("Please enter a random number (days): ");
        userInteger = sc.nextInt();
        for (i = 1; i <= daysArray.length -1; i++){
            if (userInteger == daysArray[i].length()){
                System.out.println("Ha! " + daysArray[i] + " has the same number of letters");
            }
        }

        System.out.println("Please enter your name: ");
        userName = sc.next();
        if (userName.length() < 4){
            System.out.println("You have a short name!");
        } else if (userName.length() < 9 && userName.length() > 4){
            System.out.println("You have a medium name");
        } else if (userName.length() > 9){
            System.out.println("You have a long name");
        } else if (userName.contains("y")){
            System.out.println("Your name contains the letter y !");
        } else System.exit(0);






    }
    private static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
    public static boolean istPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}