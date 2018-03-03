package shapes;
import util.Input;
import shapes.circleApp;

public class circleTest {
    public static void main(String[] args) {
        Input input = new Input();

        boolean userInput = input.yesNo("Hello, would you like to create circles?");
        if(userInput){
            int userRadius = input.getInt("Please enter a radius value for the circle: ");
            circleApp circles = new circleApp(userRadius);
            System.out.println("Your circle circumference is: " + circles.getCircumference());
            System.out.println("Your circle area is: " + circles.getArea());
            System.out.println("You have created your " + circles.getnumberofCircles() + "st circle!\n");

            userInput = input.yesNo("Would you like to play again?");
            while (userInput){
                userRadius = input.getInt("Please enter a radius value for the circle: ");
                circles = new circleApp(userRadius);
                System.out.println("Your circle circumference is: " + circles.getCircumference());
                System.out.println("Your circle area is: " + circles.getArea());
                System.out.println("You have created " + circles.getnumberofCircles() + " circles!\n");
                userInput = input.yesNo("Would you like to play again?");
            }
        } else System.exit(0);
    }
}
