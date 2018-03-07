package shapes;

public class Square extends Quadrilateral{
//    private int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
////        return super.getArea();
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
////        return super.getPerimeter();
//        return side * 4;
//    }

    protected int side;


    public Square(int side) {
        super(side, side);
        this.side = side;
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
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
