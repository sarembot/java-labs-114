package sarembamitchell_lab7;

/**
 * The Point class is used to create an object that represents a point (an x and y coordinate) on a cartesian plane
 */
public class Point {
    /**
     * Initializes point on x-axis of cartesian plane for Point object
     */
    public final double X;

    /**
     * Initializes point on y-axis of cartesian plane for Point object
     */
    public final double Y;

    /**
     * Default constructor for Point class
     * Takes no parameters
     * Returns a Point object at (x = 0, y = 0)
     */
    public Point(){
        this(0, 0);
    }

    /**
     * @param x indicates the location of the point on the x-axis of a cartesian plane
     * @param y indicates the location of the point on the y-axis of a cartesian plane
     * Instantiates a Point object with at the x and y location chosen by the user
     */
    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    /**
     * This method returns the straight line distance from a coordinate on a cartesian plane to some Point object.
     * It calculates the distance between the x coordinates, and squares them using the Math.pow() function. It then calculates the distance between the y coordinates, and squares them using the Math.pow() function. It adds these two values together, which results in the distance squared. It will return the square root of the distance squared, which is equal to the straight line distance between the given coordinates and some Point object.
     * 
     * @param x2 indicates the location on the x-axis of a coordinate on a cartesian plane that the user wants to find the distance from a Point object
     * @param y2 indicates the location on the y-axis of a coordinate on a cartesian plane that the user wants to find the distance from a Point object
     * @return the straight line distance from a Point object to another coordinate on a cartesian plane.
     */
    public double distanceFrom(double x2, double y2) {
        double distSquared = Math.pow(this.X - x2, 2) + Math.pow(this.Y - y2, 2);
        return Math.sqrt(distSquared);
    }

    /**
     * This method returns the straight line distance from one Point object to another.
     * It calculates the distance between the x coordinates of the Point, and squares them using the Math.pow() function. It then calculates the distance between the y coordinates of the Point, and squares them using the Math.pow() function. It adds these two values together, which results in the distance squared. It will return the square root of the distance squared, which is equal to the straight line distance between the two Point objects.
     * 
     * @param point indicates a Point object of which a user can find the straight line distance from some other Point object
     * @return the straight line distance from one Point object to another
     */
    public double distanceFrom(Point point) {
       return distanceFrom(point.X, point.Y);
    }

    @Override
    public String toString() {
        return "Point: x = " + this.X + ", y = " + this.Y;
    }
}
