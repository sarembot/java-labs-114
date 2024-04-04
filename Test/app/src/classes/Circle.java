package classes;

import java.awt.*;

public class Circle {

    Point center;
    double radius;
    static int numberOfCircles;

    Circle() {
        numberOfCircles++;
     };

    Circle(Point center, double radius){
        numberOfCircles++;
        this.center = center;   // this keyword says that the attribute that is called 
        this.radius = radius;   //'center' should be equal to the parameter center, same with radius
    }

    double getPerimeter(){
        return 2 * Math.PI * radius; 
        // can use radius without 'this' keyword because there is not another variable called radius inside the method scope
    }

    double getArea() {
        return Math.PI * this.radius * this.radius; //this keyword not necessary but added for clarity
    }
    
    void setCenter(Point center) {
        this.center = center;
        //this keyword helps to distingush the parameter from the attribute
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    static int getNumberOfCircles() {
        return numberOfCircles;
    }
}
