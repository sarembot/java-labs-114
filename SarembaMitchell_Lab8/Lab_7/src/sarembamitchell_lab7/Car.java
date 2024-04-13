package sarembamitchell_lab7;

public class Car {
    /**
     * The company that makes the car.
     */
    public String make;
    /**
     * The specific model of the car.
     */
    public String model;
    /**
     * The year the car was made.
     */
    public int year;
    /**
     * The Person who owns the car.
     */
    public Person owner;
    /**
     * The amount of kilometers that the car has travelled. 
     */
    public long odometer;

    /**
     * Creates a Car object that can be used to drive around. The "owner" will have an initial value of null, so that new owners can be added later, depending on who owns the car at different times. The odometer will initially be set to 0, because the car is always brand new when it is first created.
     * @param make Indicates the company that makes the car.
     * @param model Indicates the specific model of the car.
     * @param year Indicates the year that the car was made. 
     */
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

        this.odometer = 0;
        this.owner = null;
    }

    /**
     * This method allows the car to be driven for a set amount of kilometers. After the drive, it returns the value of the odometer.
     * @param km Indicates the length of the drive. Negative value will be treated as the drive happens in reverse.
     * @return The current value of the odometer after the drive.
     */
    public long drive(long km) {
        System.out.println("VRUMBUDUDUMDUDUDUM... beep beep");
        if (km < 0)
            km*= -1;
        return this.odometer += km;
    }

    @Override
    public String toString() {
        return "Car: " + this.year + " " + this.make + " " + this.model;
    }
}
