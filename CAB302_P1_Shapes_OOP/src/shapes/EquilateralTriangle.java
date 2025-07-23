/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent an Equilateral Triangle shape - contains 3 sides of equal length and
 * contains 3 vertices
 */

public class EquilateralTriangle extends Shape2D  {
    private double sideLength;


    /**
    * Constructor for Equilateral Triangle  shape object
    * @param centre The centre of the Equilateral Triangle represented as a Point object
    * @param sideLength The length of each side (all same as equilateral)
    */
    public EquilateralTriangle(Point centre, double sideLength) {
        super(centre);
        this.centre = centre;
        this.sideLength = sideLength;
    }


    @Override
    public double getArea() {
        return (Math.sqrt(3)/4) * sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 3 * sideLength;
    }

    @Override
    public void translate(double x, double y) {
        this.centre = new Point(centre.getXCord() + x, centre.getYCord() + y);

    }

    @Override
    public Point[] getVertices() {
        return new Point[0];
    }

    @Override
    public boolean containsPoint(Point point) {
        double distance = Math.sqrt(Math.pow(point.getXCord() - centre.getXCord(), 2) +
                Math.pow(point.getYCord() - centre.getYCord(), 2));
        return distance <= sideLength;
    }
}
