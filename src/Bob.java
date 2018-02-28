import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String answer1 = "Sure";
        String answer2 = "Whoa, chill out!";
        String answer3 = "Fine.  Be that way";
        String answer4 = "Whatever!";
//        Bob answers 'Sure.' if you ask him a question.
//                He answers 'Whoa, chill out!' if you yell at him.
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//                He answers 'Whatever.' to anything else.
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Argue with Bob, if don't feel like type 'no' ");
        userInput = sc.nextLine();
        do {
            if(userInput.contains("?")){
                System.out.println("Bob says: " + answer1);
//                userInput = sc.nextLine();
            } else if (userInput.endsWith("!") || userInput.toUpperCase().equals(userInput)){
                System.out.println("Bob says: " + answer2);
//                userInput = sc.nextLine();
            } else if (userInput.startsWith(" ")){
                System.out.println("Bob says: " + answer3);
//                userInput = sc.nextLine();
            } else System.out.println("Bob says: " + answer4);
                userInput = sc.nextLine();

        } while (!userInput.equals("no"));


    }
}
