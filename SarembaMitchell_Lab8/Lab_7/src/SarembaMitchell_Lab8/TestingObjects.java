package SarembaMitchell_Lab8;

import SarembaMitchell_Lab7.Person;
import java.util.ArrayList;

public class TestingObjects {
    public static void main(String[] args) {
        // Employee bob = new Employee("Bob", "Saget", "1000", "Janitor");

        // System.out.println(bob.ID);
        // // bob.coffeeBreak();

        // System.out.println(bob.toString());

        // STUDENT TESTS - Simulate a student completing a 2 year diploma

        // Constructor
        Student bilbo = new Student("Bilbo", "Baggins", "C0987679", "Computer Science");

        bilbo.study(); // will study for 100 hours to ensure success in courses

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
        System.out.println(bilbo.grades); // Passed - 100% in all classes

        // Complete another semester
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();

        // Check to see if year is updated
        System.out.println(bilbo.year); // passed - year = 2
        
        // Check credits - expecting 30
        System.out.println(bilbo.credits); // passed

        // Year 2

        // semester 1
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();

        // semester 2

        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();
        bilbo.study();
        bilbo.completeCourse();

        // Test to see if Bilbo is eligible for graduation - credits should be 60
        bilbo.graduate(); // passed

    }
}

