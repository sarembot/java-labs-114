package SarembaMitchell_Lab8;

import SarembaMitchell_Lab7.Person;

public class TestingObjects {
    public static void main(String[] args) {
        // Employee bob = new Employee("Bob", "Saget", "1000", "Janitor");

        // System.out.println(bob.ID);
        // // bob.coffeeBreak();

        // System.out.println(bob.toString());

        Student jim = new Student("Jim", "Buckerfield", "C098789", 1, "Computer Science");

        jim.study();
        jim.study();

        System.out.println(jim.studyHours);
        jim.completeCourse();
        jim.graduate();
        
    }
}

