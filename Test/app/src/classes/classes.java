package classes;

import java.awt.Point;

public class classes {
    public static void main(String[] args) {
        System.out.println(Circle.getNumberOfCircles());
    
        Circle c1 = new Circle(new Point(1, 2), 3);
        Circle c2 = new Circle(new Point(2, 3), 2);

        System.out.println("c1 radius = " + c1.radius);
        System.out.println("c2 radius = " + c2.radius);

        System.out.println(Circle.getNumberOfCircles());
        System.out.println(Circle.numberOfCircles);

        new C1();
    }
}