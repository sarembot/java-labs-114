package classes;

import java.awt.Point;
import java.awt.Rectangle;

public class Chapter10 {
    public static void main(String[] args) {
        System.out.println();
        Point blank = new Point(3, 4); // creates a point object with two variables, x and y

        // use dot notation to access an object's attributes

        int x = blank.x; // 3 - can be read as "go to the object blank refers to and get the value of attribute x"

        int y = blank.y; // 4

        System.out.println(blank);

        Rectangle box = new Rectangle(0,0,100,200);
        System.out.println(box);

    }
}
