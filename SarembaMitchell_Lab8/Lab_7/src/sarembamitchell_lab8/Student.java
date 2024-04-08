package sarembamitchell_lab8;

import java.util.Scanner;
import sarembamitchell_lab7.*;
import java.util.ArrayList;

/**
 * Class used to represent students completing a diploma at Camosun College.
 */
public class Student extends Person {
    /**
     * Represents the school that every Student goes to.
     */
    public static String school = "Camosun College";
    public static int idCounter = 100;

    /**
     * Represents how far along a student is into their diploma.
     */
    public int year;
    /**
     * The area that a student is studying in.
     */
    public String major;
    /**
     * Represents how many courses a student has completed.
     */
    public double credits;
    /**
     * Represents how many hours a student has studied.
     */
    public double studyHours;
    public ArrayList<Integer> grades;

    /**
     * This constructor is used to instatiate Students at Camosun College.
     * @param firstName Indicates a student's first name
     * @param lastName Inidcates a student's last name
     * @param cNumber Indicates a student's unique identifier
     * @param major Indicates the subject the student is studying
     */
    public Student(String firstName, String lastName, String major) {
        super(Integer.toString(idCounter++), firstName, lastName);

        this.year = 1;
        this.major = major;
        this.credits = 0;
        this.studyHours = 0;
        this.grades = new ArrayList<Integer>();
    }

    /**
     * Allows a student to study for a specified amount of time.
     * @return The amount of time the student spent studying.
     */
    public double study() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours would you like to study for? ");
        if (input.hasNextDouble())
            this.studyHours += input.nextDouble();
        else
            System.out.println("That's not a number.");

        return this.studyHours;
    }

    /**
     * Allows a student to complete a course. The grade that the student received will be based on how many hours the student has spent studying. After they complete the course, they will have to study again before they complete another course. Once a student completes 10 courses, they will have completed a full year of studies.
     * 
     */
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

    /**
     * After a student completes 10 courses, this method updates their progress in their diploma. This method is private so that it only runs inside the completeCourse() method.
     * 
     */
    private void completeYear() {
        this.year += 1;
        if (this.year == 3)
            year = 0;
    }

    /**
     * This method allows a student to check if they're eligible for graduation. If they have at least 60 credits, they will receive their diploma.
     */
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

    @Override
    public String toString() {
        return "Student: " + this.firstName + " " + this.lastName + "\nSchool: " + Student.school + "\nStudent ID: " + this.ID + "\nYear: " + this.year + "\nMajor: " + this.major + "\nCredits: " + this.credits;
     }
}