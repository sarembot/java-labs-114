package sarembamitchell_lab8;

public class TestingObjects {
    public static void main(String[] args) {

        // STUDENT TESTS - Simulate a student completing a 2 year diploma

        // Constructor
        Student bilbo = new Student("Bilbo", "Baggins", "Computer Science");

        // Test to make sure all attributes are correct
        System.out.println(bilbo.firstName); //passed
        System.out.println(bilbo.lastName); // passed
        System.out.println(bilbo.ID); // passed
        System.out.println(Student.school); // passed
        System.out.println(bilbo.year); // passed
        System.out.println(bilbo.major); // passed
        System.out.println(bilbo.credits); // passed
        System.out.println(bilbo.studyHours); // passed
        System.out.println(bilbo.grades); // passed

        // Test static idCounter
        Student tom = new Student("Tom", "Bombadil", "Frolicking");

        System.out.println(tom.ID); // passed

        bilbo.study(); // study for the first course

        // Complete a semester's worth of courses
        bilbo.completeCourse(); // have to study for each course individually
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();

        // Test to see if grades are updated
        System.out.println(bilbo.grades); // Passed - 5 courses in grades

        // Complete another semester
        for (int i = 0; i < 5; i++){
            bilbo.study();
            bilbo.completeCourse();
        }

        // Check to see if year is updated
        System.out.println(bilbo.year); // passed - year = 2
        
        // Check credits - expecting 30
        System.out.println(bilbo.credits); // passed

        // Year 2
        for (int i = 0; i < 10; i++){
            bilbo.study();
            bilbo.completeCourse();
        }
        // Test to see if Bilbo is eligible for graduation - credits should be 60
        bilbo.graduate(); // passed

        //test toString()
        System.out.println(bilbo.toString()); //passed



        // GRADUATE STUDENT TESTS
        
        // constructor
        GraduateStudent frodo = new GraduateStudent("Frodo", "Baggins", "Computer Science", "Algorithms and stuff");

        // toString()
        System.out.println(frodo.toString());


        // EMPLOYEE TESTS
        
        // constructor
        Employee gandalf = new Employee("Gandalf", "The Grey" , "Senior Director of Wizardry");

        // coffee break method - run loop to test all menu options
        for(int i = 0; i < 4; i++)
            gandalf.coffeeBreak(); // passed

        // test if user enters a string - expected output "Try again when you know what you want to order."
        gandalf.coffeeBreak(); // passed

        // test if user orders off the menu - expected "I'm gonna have to ask you to leave."
        gandalf.coffeeBreak(); // passed

        // toString() method
        System.out.println(gandalf.toString()); //passed

    }
}

