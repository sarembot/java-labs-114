package classes;
public class Rectangle extends GeoObject implements Drawable {
    private double width;
    private double height;

    public Rectangle(){
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(boolean isFilled, String color, double width, double height) {
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Rectangle = Drawn");
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + "Width: " + this.getWidth() + " Height: " + this.getHeight();
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
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
