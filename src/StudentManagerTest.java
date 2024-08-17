import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class contains unit tests for the StudentManager class.
 */
public class StudentManagerTest {
    /**
     * Tests the StudentManager constructor.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void studentManagerTest() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);

        // Assert the course count to verify courses were loaded correctly
        int expectedCourseCount = 15; // This is based on your previous test, adjust as needed
        assertEquals(expectedCourseCount, manager.getCourseCount());

        // Assert one of the student counts to verify students were loaded correctly for a course
        int expectedStudentCountForFirstCourse = 24; // This is based on your previous test, adjust as needed
        assertEquals(expectedStudentCountForFirstCourse, manager.getStudentCount(0));

        // Optionally, assert the name of the first course to further verify the constructor
        assertEquals("CSC110a", manager.getCourseName(0));

        // Optionally, check if the first student in the first course matches the expected ID
        assertEquals("228229", manager.getStudent(0, 0).id());
    }
    /**
     * Tests the getCourseCount method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetCourseCount() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);

        assertEquals(15, manager.getCourseCount());
    }
    /**
     * Tests the getStudentCountForCourse method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetStudentCountForCourse() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);

        assertEquals(24, manager.getStudentCount(0));
        assertEquals(27, manager.getStudentCount(1));
    }
    /**
     * Tests the getTotalStudentCount method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetTotalStudentCount() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);

        assertEquals(403, manager.getStudentCount());
    }
    /**
     * Tests the getStudentCountForCourseName method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetStudentCountForCourseName() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);

        assertEquals(24, manager.getStudentCount("CSC110a"));
        assertEquals(27, manager.getStudentCount("CSC110b"));
    }
    /**
     * Tests the getCourseName method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetCourseName() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);

        assertEquals("CSC110a", manager.getCourseName(0));
        assertEquals("CSC110b", manager.getCourseName(1));
    }
    /**
     * Tests the getStudent method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetStudent() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);
        Student student = manager.getStudent(0, 0);

        assertEquals("228229", student.id());
    }
    /**
     * Tests the findStudentCourse method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testFindStudentCourse() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);
        int courseIndex = manager.findStudentCourse("205003");

        assertEquals(0, courseIndex);
    }
    /**
     * Tests the getStudentsForCourse method.
     *
     * @throws FileNotFoundException if the required files are not found.
     */
    @Test
    public void testGetStudentsForCourse() throws FileNotFoundException {
        File courseList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Courses.csv");
        File studentList = new File("C:\\Users\\samue\\Downloads\\Proj01\\Students.csv");
        StudentManager manager = new StudentManager(courseList, studentList);
        Student[] studentsForCourse = manager.getStudents(0);  // For the first course

        assertNotNull(studentsForCourse);   // Making sure it's not null
        assertTrue(studentsForCourse.length > 0);   // Making sure it has students
    }

}
