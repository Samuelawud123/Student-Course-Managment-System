/**
 * This interface defines the methods for managing students across multiple courses.
 */
public interface StudentManagerInterface {

    /**
     * Retrieves the count of courses.
     *
     * @return count of courses
     */
    public int getCourseCount();

    /**
     * Retrieves the number of students in the specified course (by index).
     *
     * @param courseIndex the index of the course
     * @return student count in that course
     */
    public int getStudentCount(int courseIndex);

    /**
     * Retrieves the number of students in all courses.
     *
     * @return student count in all courses
     */
    public int getStudentCount();

    /**
     * Retrieves the number of students in the specified course (by name).
     *
     * @param courseName the name of the course to search for
     * @return student count in that course, or -1 if the course is not found
     */
    public int getStudentCount(String courseName);

    /**
     * Retrieves the course name at the specified index.
     *
     * @param courseIndex index of the desired course
     * @return course name
     */
    public String getCourseName(int courseIndex);

    /**
     * Retrieves the student at the specific course and student index.
     *
     * @param courseIndex  course index
     * @param studentIndex student index
     * @return student at that array position
     */
    public Student getStudent(int courseIndex, int studentIndex);

    /**
     * Retrieves a copy of the student array for the course at the specified index.
     *
     * @param courseIndex course index
     * @return copy of the student array (not a reference to the internal one)
     */
    public Student[] getStudents(int courseIndex);

    /**
     * Retrieves the first course index associated with the specified student id.
     *
     * @param id the student id to search for
     * @return the first course index containing the specified student, or -1 if not found
     */
    public int findStudentCourse(String id);
}
