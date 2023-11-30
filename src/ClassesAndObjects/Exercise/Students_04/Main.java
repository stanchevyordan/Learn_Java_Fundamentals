package ClassesAndObjects.Exercise.Students_04;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int count = 1; count <= countStudents; count++) {
            String studentInfo = scanner.nextLine();
            String firstName1 = studentInfo.split(" ")[0];
            String lastName1 = studentInfo.split(" ")[1];
            double grade1 = Double.parseDouble(studentInfo.split(" ")[2]);

            Student student = new Student(firstName1, lastName1, grade1);
            studentList.add(student);
        }

        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade) //
                                                                    .reversed()); //

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }


    }
}
