package ClassesAndObjects.Exercise.Students_04;

public class Student {
    private String firstName;

    private String lastName;

    private double grade;

    public Student (String firstName1, String lastName1, double grade1) {
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.grade = grade1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }
}
