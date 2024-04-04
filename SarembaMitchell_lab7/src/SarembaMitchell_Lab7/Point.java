package SarembaMitchell_Lab7;

public class Point {
    
    public double x;
    public double y;

    public Point(){
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(double x2, double y2) {
        double distSquared = Math.pow(this.x - x2, 2) + Math.pow(this.y - y2, 2);
        return Math.sqrt(distSquared);
    }

    public double distanceFrom(Point point) {
       return distanceFrom(point.x, point.y);
    }

    @Override
    public String toString() {
        return "Point: x = " + this.x + ", y = " + this.y;
    }
}
