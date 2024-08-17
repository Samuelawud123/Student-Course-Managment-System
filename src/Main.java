import java.io.File;
import java.io.FileNotFoundException;
/**
 * The Main class provides a sample usage of the StudentManager class to manage courses and students.
 * It demonstrates various functionalities such as displaying total courses, total students,
 * students count for each course, displaying all students from a specific course,
 * and finding the course of a specific student.
 */
public class Main {

    /**
     * Default constructor for the Main class.
     */
    public Main() {
        // Default constructor provided by the compiler
    }

    /**
     * The main method serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     * @throws FileNotFoundException If the specified CSV files for courses and students are not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Sample usage of StudentManager

        // Initialize file paths for course and student CSV files
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");

        // Create a StudentManager instance with the provided CSV files
        StudentManager manager = new StudentManager(courseList, studentList);

        //  Display Total Courses
        System.out.println("Total Courses: " + manager.getCourseCount());

        //  Display Total Students
        System.out.println("Total Students: " + manager.getStudentCount());


        //  Display All Students from a Specific Course (e.g., first course)
        System.out.println("\nStudents in course " + manager.getCourseName(0) + ":");
        Student[] courseStudents = manager.getStudents(0);
        for (Student student : courseStudents) {
            System.out.println(student);  // Using the overridden toString() method
        }

        //  Find Course of a Specific Student (using their ID)
        // Let's take the ID of the first student from the first course for demonstration
        if (courseStudents.length > 0) {
            String studentId = courseStudents[0].id();
            int courseIndexOfStudent = manager.findStudentCourse(studentId);
            System.out.println("\nCourse of student with ID " + studentId + ": " + manager.getCourseName(courseIndexOfStudent));
        }
    }

}
