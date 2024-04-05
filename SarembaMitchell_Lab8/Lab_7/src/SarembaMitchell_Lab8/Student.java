package SarembaMitchell_Lab8;

import SarembaMitchell_Lab7.Person;

/**
 * Student
 */
public class Student extends Person {
    public String cNumber;
    public int year;
    public String major;
    public int gpa;

    public Student(String firstName, String lastName, String cNumber, int year, String major) {
        super(firstName, lastName);

        this.cNumber = cNumber;
        this.year = year;
        this.major = major;

    }
    
}