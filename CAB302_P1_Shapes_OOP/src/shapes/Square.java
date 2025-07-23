/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

public class Square  extends  Shape2D {
    private double side;
    public Square(Point centre, double side) {
        super(centre);
        this.centre = centre;
        this.side = side;

    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
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
        return distance <= side;
    }
}
