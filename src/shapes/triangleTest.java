package shapes;
import util.Input;

public class triangleTest {
    public static void main(String[] args) {
        Input input = new Input();
        triangle triangle = new triangle("\nHello and welcome to my triangle app.  This app will help you with find all the geometric results of any right triangle!  Enjoy!");
        System.out.println(triangle.getWelcome());

        boolean userInput = input.yesNo("Would you like to continue?");
        if(userInput){
            System.out.println("Please enter a value for the 'opposite' side of the triangle: ");
            double opposite = input.getDouble();
            System.out.println("Please enter a value for the 'adjacent' side of the triangle: ");
            double adjacent = input.getDouble();
            triangle.setHypotenuse(opposite,adjacent);
            System.out.printf("\nThe value of your triangle's hypotenuse is: %.2f.\n", triangle.getHypotenuse());
            System.out.printf("The value of the 'opposite angle' is: %.1f degrees.\n", triangle.getOppositeAngle());
            System.out.printf("The value of the angle opposite to the adjacent side is: %.1f degrees.\n", triangle.getAdjacentAngle());
            System.out.printf("\nYou have built your %dst triangle!\n", triangle.getNumberOfTriangles());
            userInput = input.yesNo("Would you like to enter another triangle?");
            while(userInput){
                System.out.println("Please enter a value for the 'opposite' side of the triangle: ");
                opposite = input.getDouble();
                System.out.println("Please enter a value for the 'adjacent' side of the triangle: ");
                adjacent = input.getDouble();
                triangle.setHypotenuse(opposite,adjacent);
                System.out.printf("\nThe value of your triangle's hypotenuse is: %.2f\n", triangle.getHypotenuse());
                System.out.printf("The value of the 'opposite angle' is: %.1f degrees.\n", triangle.getOppositeAngle());
                System.out.printf("The value of the angle opposite to the adjacent side is: %.1f degrees.\n", triangle.getAdjacentAngle());
                System.out.printf("\nYou have built %d triangles!\n", triangle.getNumberOfTriangles());
                userInput = input.yesNo("Would you like to enter another triangle?");
            }
        } else System.out.println("Thank you for playing");
        System.exit(0);
    }
}
