package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
//    private int length;
//    private int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return  2 * length + 2 * width;
//    }


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return  2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
