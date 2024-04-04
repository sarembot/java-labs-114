package classes;

public class Casting {
    public static void main(String[] args) {
        // IMPLICIT CASTING
        Object v1 = new Rectangle();
        GeoObject v2 = new Rectangle();

        System.out.println(v1);
        System.out.println(v2);

        // EXPLICIT CASTING
        // if we try and do something like:
            // Rectangle v2 = v1;
            // It throws an error. Because we are trying to store an Object REFERENCE inside of a Rectangle
        // In this case, we use explicit casting

        Rectangle v3 = (Rectangle) v1;
        System.out.println(v3);

        // Before casting, we can use the instanceof operator to make sure that the types are compatible

        Object v4 = new Rectangle(4.0, 5.0);

        if(v4 instanceof Rectangle) {
            Rectangle v5 = (Rectangle) v4;
            System.out.println(v5);
        }
    }
}
