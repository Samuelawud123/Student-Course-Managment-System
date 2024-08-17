import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Manages students across multiple courses.
 * <p>
 * This class reads from two files: a course list file and a student list file.
 * The course list file contains the course names and their respective enrollment capacities.
 * The student list file contains the students associated with each course.
 * </p>
 */
public class StudentManager implements StudentManagerInterface {
    /**
     * Array to store course names.
     */
    private final String[] courses;
    /**
     * 2D Array to store students for each course.
     */
    private final Student[][] students;
    /**
     * Constructs a new student manager using the provided course and student list files.
     *
     * @param courseList  the file containing the list of courses.
     * @param studentList the file containing the list of students for each course.
     * @throws FileNotFoundException if either file cannot be found.
     */
    public StudentManager(File courseList, File studentList) throws FileNotFoundException {
        Scanner courseReader; // Declaring courseReader
        Scanner studentReader; // Declaring studentReader

        // Read courses file
        courseReader = new Scanner(courseList);
        int numberOfCourses = Integer.parseInt(courseReader.nextLine().trim()); // Number of courses
        courseReader.nextLine();  // Skip the header line with "course,enrollment"
        courses = new String[numberOfCourses];
        students = new Student[numberOfCourses][];
        for (int i = 0; i < numberOfCourses; i++) {
            String[] courseItems = courseReader.nextLine().split(",");
            courses[i] = courseItems[0];
            students[i] = new Student[Integer.parseInt(courseItems[1])];
        }
        courseReader.close();

        // Read students file
        studentReader = new Scanner(studentList);
        studentReader.nextLine();  // Skip the header
        while (studentReader.hasNext()) {
            String[] studentData = studentReader.nextLine().split(",");
            int courseIndex = Arrays.asList(courses).indexOf(studentData[0]);
            for (int j = 0; j < students[courseIndex].length; j++) {
                if (students[courseIndex][j] == null) {
                    students[courseIndex][j] = new Student(studentData[1], studentData[2], studentData[3], studentData[4], studentData[5]);
                    break;
                }
            }
        }
        studentReader.close();
    }
    /**
     * Returns the number of courses managed.
     *
     * @return the number of courses.
     */
    @Override
    public int getCourseCount() {
        return courses.length;
    }
    /**
     * Returns the number of students enrolled in the specified course.
     *
     * @param courseIndex the index of the course.
     * @return the number of students in the specified course.
     */
    @Override
    public int getStudentCount(int courseIndex) {
        return students[courseIndex].length;
    }
    /**
     * Returns the total number of students across all courses.
     *
     * @return the total number of students.
     */
    @Override
    public int getStudentCount() {
        int totalStudentCount = 0;
        for (Student[] studentArr : students) {
            totalStudentCount += studentArr.length;
        }
        return totalStudentCount;
    }
    /**
     * Returns the number of students enrolled in the specified course by its name.
     *
     * @param courseName the name of the course.
     * @return the number of students in the specified course, or -1 if the course is not found.
     */
    @Override
    public int getStudentCount(String courseName) {
        int courseIndex = Arrays.asList(courses).indexOf(courseName);
        if (courseIndex == -1) return -1;
        return getStudentCount(courseIndex);
    }
    /**
     * Returns the name of the course at the specified index.
     *
     * @param courseIndex the index of the course.
     * @return the name of the course.
     */
    @Override
    public String getCourseName(int courseIndex) {
        return courses[courseIndex];
    }
    /**
     * Returns the student at the specified indices in the 2D students array.
     *
     * @param courseIndex  the index of the course.
     * @param studentIndex the index of the student within the course.
     * @return the student at the specified indices.
     */
    @Override
    public Student getStudent(int courseIndex, int studentIndex) {
        return students[courseIndex][studentIndex];
    }
    /**
     * Returns an array of all students in the specified course.
     *
     * @param courseIndex the index of the course.
     * @return an array of students in the course.
     */
    @Override
    public Student[] getStudents(int courseIndex) {
        return students[courseIndex].clone();
    }
    /**
     * Searches for a student by ID and returns the course index in which they are enrolled.
     *
     * @param id the unique identifier of the student.
     * @return the index of the course the student is enrolled in, or -1 if the student is not found.
     */
    @Override
    public int findStudentCourse(String id) {
        for (int i = 0; i < students.length; i++) {
            for (Student student : students[i]) {
                if (student != null && student.id().equals(id)) {  // Added null-check
                    return i;
                }
            }
        }
        return -1;
    }
}
