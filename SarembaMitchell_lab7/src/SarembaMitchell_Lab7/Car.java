package SarembaMitchell_Lab7;

public class Car {
    public String make;
    public String model;
    public int year;
    public Person owner;
    public long odometer;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

        this.odometer = 0;
        this.owner = null;
    }

    public long drive(long km) {
        System.out.println("VRUMBUDUDUMDUDUDUM... beep beep");
        this.odometer += km;
        return this.odometer;
    }

    @Override
    public String toString() {
        return "Car: " + this.year + " " + this.make + " " + this.model;
    }
}
