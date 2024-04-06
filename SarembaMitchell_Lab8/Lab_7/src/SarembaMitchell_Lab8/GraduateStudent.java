package SarembaMitchell_Lab8;


public class GraduateStudent extends Student {
    public String thesis;

    public GraduateStudent(String firstName, String lastName, String cNumber, int year, String major, String thesis) {
        super(firstName, lastName, cNumber, year, major);

        this.thesis = thesis;
    }
}
