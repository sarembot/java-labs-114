package classes;

public class Shape {
    private boolean isFilled;
    private String color;

    public Shape(){
        
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }


    public boolean isFilled() {
        return this.isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
