package classes;

public class Exercise1 {
    private double width;
    private double height;

    public Exercise1(){
        this(1.0, 1.0);
    }

    public Exercise1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
}