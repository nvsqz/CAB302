/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

public class Rectangle extends Shape2D {
    private double width;
    private double length;
    /**
     * Constructor for Rectangle shape object
     * @param centre The centre of the Rectangle represented as a Point object
     * @param width The width of rectangle
     * @param length The length of rectangle
     */
    public Rectangle(Point centre, double width, double length) {
        super(centre);
        this.centre = centre;
        this.width = width;
        this.length = length;

    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
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
        return distance <= length;
    }
}
