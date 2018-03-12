package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class InputTest {
    public static void main(String[] args) throws IOException {
        Input in = new Input();
        FileHelper fileHelper = new FileHelper();


//        boolean string1 = in.yesNo("Hello would you like to run this app?");
//        if (string1){
//            int num1 = in.getInt(1,10,"Please enter a number between 1 and 10:");
//            System.out.println("You entered the number " + "'" + num1 + "'");
//            double double1 = in.getDouble(1.0,100.0, "Please enter a decimal from 1.0 to 100.0");
//            System.out.println("You entered the decimal " + "'" + double1 + "'");
//        } else
//            System.exit(0);

//        System.out.println("Please enter a number: ");
//        int userInput = in.getInt();
//        System.out.println("You entered: " + userInput);
//
//        System.out.println("Please enter a decimal: ");
//        double userDouble = in.getDouble();
//        System.out.println("You entered: " + userDouble);
//
//        System.out.println("Please enter a binary number: ");
//        System.out.println("You entered: "+ in.getBinary());
//
//        System.out.println("Please enter a Hex number: ");
//        System.out.println("You entered: "+ in.getHex());
//        fileHelper.slurp("/Users/Gonzo 1/IdeaProjects/", "newContacts.csv");

//        fileHelper.slurp("/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/src", "ControlStructureBonuses.java");
        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello !");
//        list.add("This is a test");
//        list.add("Nothing but a test!");
//        list.add("This another run and we added this line");
//
//        fileHelper.spit("/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/src/test",list,true);
//        fileHelper.slurp("/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/src","test");
//        fileHelper.makeExciting("/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/src/test_news.out");

//        fileHelper.copy("/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/src/test_news.out",
//                "/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/test_news.out");

//        fileHelper.move("/Users/Gonzo 1/IdeaProjects/codeup-java-exercise/test_news.out",
//                "/Users/Gonzo 1/IdeaProjects/test_news.out");

        fileHelper.findString("/Users/Gonzo 1/IdeaProjects/newContacts.csv","Chauncey");


    }
}
