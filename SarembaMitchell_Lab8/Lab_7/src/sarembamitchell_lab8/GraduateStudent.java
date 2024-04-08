package sarembamitchell_lab8;
/**
 * Class used to represent graduate students studying at the University of Victoria.
 */
public class GraduateStudent extends Student {
    public static String school = "University of Victoria";
    public String thesis;
    
    public GraduateStudent(String firstName, String lastName, String major, String thesis) {
        super(firstName, lastName, major);

        this.thesis = thesis;
    }

    // Was going to use super() but I think it's easier to customize by just writing it out 
    @Override
    public String toString() {
        return "Student: " + this.firstName + " " + this.lastName + "\nSchool: " + GraduateStudent.school + "\nStudent ID: " + this.ID + "\nYear: Grad Student\nMajor: " + this.major + "\nThesis: " + this.thesis;
    }
}
