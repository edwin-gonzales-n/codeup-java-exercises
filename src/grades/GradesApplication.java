package grades;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        Student student1 = new Student("Edwin");
        student1.addGrade(80); student1.addGrade(90); student1.addGrade(100); student1.addGrade(95);
        Student student2 = new Student("Joe");
        student2.addGrade(90); student2.addGrade(95); student2.addGrade(95); student2.addGrade(95);
        Student student3 = new Student("Gonzo");
        student3.addGrade(95);  student3.addGrade(98);  student3.addGrade(98);  student3.addGrade(98);
        Student student4 = new Student("Bob");
        student4.addGrade(98);  student4.addGrade(98); student4.addGrade(98); student4.addGrade(100);

        HashMap students = new HashMap<String, Integer>(); // HashMap Initializing
        students.put("ED_TheMonsta",student1.getGradeAverage()); //Assigning gitHub username + super class average data
        students.put("JoeBoy1994",student2.getGradeAverage()); //Assigning gitHub username + super class average data
        students.put("GonzoInTexas",student3.getGradeAverage()); //Assigning gitHub username + super class average data
        students.put("Bob_ElLoco",student4.getGradeAverage()); //Assigning gitHub username + super class average data

        Set<String> keys = students.keySet(); //get keys from students Hashmap
        TreeSet<String> sortedKeys = new TreeSet<>(keys); // sorted logic to display usernames in order.

        do{ // do while starts as true and repeats until user types exit.
            System.out.println("\nWelcome\n" +
                    "Here are the github usernames of our students:");
            for(String key : sortedKeys) // for each loop to get data from the keyset
                System.out.printf("|%s| ", key ); //  displaying names as asked in exercise

            // App begins asking user to select a user
            System.out.println("\nWhat student would you like to see more information on?  Enter 'exit' to leave program.");
            userInput = input.next();
            for(String key : sortedKeys) // for each to extract keys' data
                if(key.equalsIgnoreCase(userInput)){ //  if userInput contains data in any of keys then display
                    System.out.println("The average grade of "+ key + " is " + students.get(key) + ". ");
                    if(userInput.equalsIgnoreCase("ED_TheMonsta")){
                        System.out.println("Name: " + student1.getName() + ". Total grades: " + student1.getGrades());
                        break;
                    } else if(userInput.equalsIgnoreCase("JoeBoy1994")){
                        System.out.println("Name: " + student2.getName() + ". Total grades: " + student2.getGrades());
                        break;
                    } else if(userInput.equalsIgnoreCase("GonzoInTexas")){
                        System.out.println("Name: " + student3.getName() + ". Total grades: " + student3.getGrades());
                        break;
                    } else if(userInput.equalsIgnoreCase("Bob_ElLoco")){
                        System.out.println("Name: " + student4.getName() + ". Total grades: " + student4.getGrades());
                        break;
                    }
                } else if(userInput.equalsIgnoreCase("exit")){  // exit program upon typing 'exit'
                    System.exit(0);
                }
        } while(true);
    } // end of main
} // end of function
