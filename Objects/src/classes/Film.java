package classes;

public class Film extends Video {

    private String type;
    private String star;
    
    public Film(String name, double duration, String type, String star) {
        super(name, duration);
        this.type = type;
        this.star = star;
    }
    
    public String toString(){
        return "Name: " + this.name + "\nDuration: " + this.duration + "\nType: " + this.getType() + "\nStar: " + this.getStar();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStar() {
        return this.star;
    }

    public void setStar(String star) {
        this.star = star;
    }

}
