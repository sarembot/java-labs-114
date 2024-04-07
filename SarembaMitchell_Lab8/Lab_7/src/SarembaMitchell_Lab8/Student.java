package SarembaMitchell_Lab8;

import java.util.Scanner;
import java.util.ArrayList;
import SarembaMitchell_Lab7.*;

/**
 * Student
 */
public class Student extends Person {
    public int year;
    public String major;
    public double credits;
    public double studyHours;
    public ArrayList<Integer> grades;
    // public AcademicRecord record; 

    public Student(String firstName, String lastName, String cNumber, String major) {
        super(cNumber, firstName, lastName);

        this.year = 1;
        this.major = major;
        this.credits = 0;
        this.studyHours = 0;
        this.grades = new ArrayList<Integer>();
        
    }

    public double study() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours would you like to study for? ");
        if (input.hasNextDouble())
            this.studyHours += input.nextDouble();
        else
            System.out.println("That's not a number.");

        return this.studyHours;
    }

    public void completeCourse() {
        int grade;

        if (this.studyHours > 10) {
            grade = 100;
        } else if (this.studyHours > 8) {
            grade = 80;
        } else if (this.studyHours > 7) {
            grade = 70;
        } else if (this.studyHours > 5) {
            grade = 50;
        } else
            grade = 30;
        grades.add(grade);

        if (grade >= 50) {
            this.credits += 3.0;
            this.studyHours = 0;
        } else
            System.out.println("You'll have to take this course again next semester.");
            this.studyHours = 0;

        if (grades.size() % 10 == 0)
            this.completeYear();

    }

    public void completeYear() {
        this.year += 1;
    }

    public void graduate() {
        if (this.credits >= 60){
            System.out.println("Congrats! You are eligible for graduation. Here is your diploma: \n\n" +
            "(`\\       `\\\n" +
            " `-\\ DIPLOMA\\\n" +
            "    \\   (@)  \\\n" +
            "    _\\   |\\   \\\n" +
            "   ( _)_________)\n" +
            "    `----------` ");
            // ASCII ART from https://ascii.co.uk/art/diploma
        } else
            System.err.println("You still have more work to do until you're eligible for graduation. You need " + (60 - this.credits) + " more credits.");
    }
    // Make a complete course method
    // Make a graduate method? After a certain amount of credits
    
}