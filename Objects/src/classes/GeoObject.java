package classes;

public abstract class GeoObject {
    private boolean isFilled;
    private String color;

    protected GeoObject() { }

    protected GeoObject(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();

    public String toString() {
        return "Filled: " + isFilled() + "\nColor: " + getColor(); 
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
