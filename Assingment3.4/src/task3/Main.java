package task3;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(101, "Khushbu", 22);

        Course course = new Course(
                "TX00EY23",
                "Programming",
                "Teacher");

        Enrollment enrollment = new Enrollment(
                student,
                course,
                "12.11.2026");

        // serialize the enrollment object
        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream("enrollments.ser"))) {

            output.writeObject(enrollment);

            System.out.println("Enrollment saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving object: " + e.getMessage());
        }

        // deserialize the enrollment object
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream("enrollments.ser"))) {

            Enrollment savedEnrollment =
                    (Enrollment) input.readObject();

            System.out.println("\nEnrollment Information:");

            System.out.println("Student ID: "
                    + savedEnrollment.getStudent().getId());

            System.out.println("Student Name: "
                    + savedEnrollment.getStudent().getName());

            System.out.println("Student Age: "
                    + savedEnrollment.getStudent().getAge());

            System.out.println("Course Code: "
                    + savedEnrollment.getCourse().getCourseCode());

            System.out.println("Course Name: "
                    + savedEnrollment.getCourse().getCourseName());

            System.out.println("Instructor: "
                    + savedEnrollment.getCourse().getInstructor());

            System.out.println("Enrollment Date: "
                    + savedEnrollment.getEnrollmentDate());}

        catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading object: " + e.getMessage());}
    }
}
