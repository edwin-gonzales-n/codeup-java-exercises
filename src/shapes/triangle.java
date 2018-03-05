package shapes;

public class triangle {
    private String welcome;
    private double angle;
    private double angleB;
    private double opposite;
    private double adjacent;
    private double hypotenuse;
    private static int counter=0;

    //welcome logic
    public triangle(String welcome){
        this.welcome = welcome;
    }
    public String getWelcome() {
        return welcome;
    }
    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
    //logic for hypotenuse
    public void setHypotenuse (double opposite, double adjacent){
        this.adjacent = adjacent;
        this.opposite = opposite;
        hypotenuse =  Math.sqrt(Math.pow(opposite,2) + Math.pow(adjacent,2));
        counter++;
    }
    // return hypotenuse to constructor and set counter.
    public triangle(double hypotenuse){
        this.hypotenuse = hypotenuse;
    }
    //get object for hypotenuse
    public double getHypotenuse(){
        return hypotenuse;
    }
    //angle opposite to the opposite side
    public double getOppositeAngle(){
        this.angle = Math.asin(opposite/hypotenuse);
        return Math.toDegrees(angle);
    }
    //angle opposite to the adjacent side
    public double getAdjacentAngle(){
        this.angleB = Math.acos(Math.cos(adjacent/hypotenuse));
        System.out.println("dividing " +opposite + " over " + hypotenuse);
        return Math.toDegrees(angleB);
    }
    //object to return counter
    public int getNumberOfTriangles(){
        return counter;
    }



}