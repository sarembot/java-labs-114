package sarembamitchell_lab7;

import java.util.Arrays;

public class TestingObjects {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // POINT TESTS
        System.out.println("Point tests:");

        Point point = new Point(2.0, 3.0);

        System.out.println(point.distanceFrom(2.0, 3.0)); // Should print 0.0
        System.out.println(point.distanceFrom(new Point(4.0, 6.0)));
        
        System.out.println(point.toString());

        System.out.println();

        // PERSON TESTS
        System.out.println("Person tests: ");
        Person person = new Person("Norm", "Macdonald");
        System.out.println(person.toString());

        person.sayHelloTo("Bob"); // Should print "Hello Bob, my name is Norm."
        person.sayHelloTo(new Person("Jiminy", "Cricket")); // Should print "Hello Jiminy, my name is Norm"

        System.out.println();

        // CAR TESTS
        System.out.println("Car tests:");
        Car car = new Car("Ford", "Ranger", 2000);

        car.drive(350);
        car.drive(-100); // Bueller... Anyone...
        System.out.println(car.odometer);
        System.out.println(car.toString());

        System.out.println();

        // ACADEMIC RECORD TESTS
        System.out.println("Academic Record Tests: ");
        AcademicRecord record = new AcademicRecord(person);

        record.major = "Computer Science";
        record.year = 3;
        
        for (int i = 0; i < record.grades.length; i++) {
            record.grades[i] = 70 + Math.random() * 30;
        }
        System.out.println(Arrays.toString(record.grades));

        System.out.println(record.calculateAverage());

        System.out.println(record.calculateLetterGrade(record.grades[1]));
    }
    }
