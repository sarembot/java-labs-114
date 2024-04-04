package classes;

public class Rectangle {
    // Define it's attributes
    double length; // default value = 0.0
    double width; // 0.0

    public Rectangle() {
        this(1, 1);
    } //overloading - constructs a rectangle object with default values

    // Create a constructor - same name as class
    public Rectangle(double initialLength, double initialWidth) {
        super(isFilled, color);

    }

    public Rectangle(boolean isFilled, String color, double width, double length){
        setFilled(isFilled);
        setColor(color);

        this.width = width;
        this.length = length;
    }
    // We can have more than one constructor as long as they have different parameters

    // Define it's methods
    double getPerimeter(){
        return (length + width) * 2;
    }

    double getArea() {
        return length * width;
    }

    void setLength(double newLength) {
        length = newLength;
    } 

    void setWidth(double newWidth) {
        width = newWidth;
    }

}
