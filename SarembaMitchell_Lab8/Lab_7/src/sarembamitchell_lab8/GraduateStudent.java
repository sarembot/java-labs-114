package sarembamitchell_lab8;
/**
 * Class used to represent graduate students studying at the University of Victoria.
 */
public class GraduateStudent extends Student {
    /**
     * Represents the school that a GraduateStudent attends.
     */
    public static String school = "University of Victoria";
    /**
     * Represents the focus of a GraduateStudent's studies
     */
    public String thesis;
    
    /**
     * Constructor used to create GraduateStudent objects.
     * @param firstName Represents the GraduateStudent's first name
     * @param lastName Represents their last name
     * @param major Represents the subject they study
     * @param thesis Represents their area of focus in their studies
     */
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
