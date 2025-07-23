/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Shape2D is an Abstract Class and acts as a base class for all the 2D shapes
 * which includes Equilateral Triangle, Circle, Rectangle amd Square.
 * Shape2D is a shared common ancestor between the shape classes as each of these classes subclass
 * Shape2D
 */
public abstract class Shape2D {
    protected Point centre;
    protected double area;
    protected double perimeter;

    public Shape2D(Point centre) {
        this.centre = centre;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void translate(double x, double y);
    public abstract Point[] getVertices();
    public abstract boolean containsPoint(Point point);

}
