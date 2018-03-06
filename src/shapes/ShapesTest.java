package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.printf("Box1's perimeter is %s, and area is %s \n",box1.getPerimeter(),box1.getArea());

        Square box2 = new Square(5);
        System.out.printf("Box2's perimeter is %s , and area is %s \n",box2.getPerimeter(),box2.getArea());
    }
}
