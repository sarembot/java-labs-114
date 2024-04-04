package SarembaMitchell_Lab7;

public class AcademicRecord {
    public Person student;
    public String major;
    public short year;
    public double[] grades;

    public AcademicRecord(Person person) {
        this.student = person;
        this.major = "undeclared";
        this.year = 1;
        this.grades = new double[10];
    }

    public long calculateAverage() {
        long sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return Math.round(sum / this.grades.length);
    }

    public String calculateLetterGrade(double grade) {
        String letter = "";
        if (grade >= 90)
            letter = "A+";
        else if (grade >= 85)
            letter = "A";
        else if (grade >= 80)
            letter = "A-";
        else if (grade >= 77)
            letter = "B+";
        else if (grade >= 73)
            letter = "B";
        else if (grade >= 70)
            letter = "B-";
        else if (grade >= 65)
            letter = "C+";
        else if (grade >= 60)
            letter = "C";
        else if (grade >= 50)
            letter = "D";
        else
            letter = "F";

        return letter;
        } 
    }
