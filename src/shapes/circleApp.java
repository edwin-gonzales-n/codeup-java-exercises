package shapes;
import util.Input;

public class circleApp {
    Input input = new Input();
    private double radius;
    private static int counter = 0;

    public circleApp(double radius){
        this.radius = radius;
        counter++;
    }
    public double getArea(){
        return (Math.PI * Math.pow(radius,2));
    }
    public double getCircumference(){
        return (2 * Math.PI * radius);
    }
    public int getnumberofCircles(){
        return counter;
    }

}
