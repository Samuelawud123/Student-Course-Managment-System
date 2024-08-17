import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains unit tests for the Student class.
 */
public class StudentTest {
    /**
     * Test case for the constructor with valid input.
     */
    @Test
    public void testConstructorValidInput() {
        Student student = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        assertEquals("228229", student.id());
        assertEquals("Bale", student.lastName());
        assertEquals("Allianora", student.firstName());
        assertEquals("abale0@cdbaby.com", student.email());
        assertEquals("161-231-3382", student.phone());
    }

    /**
     * Test case for the constructor with invalid input.
     */
    @Test
    public void testConstructorInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> new Student(null, "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382"));
        assertThrows(IllegalArgumentException.class, () -> new Student("228229", null, "Allianora", "abale0@cdbaby.com", "161-231-3382"));
        assertThrows(IllegalArgumentException.class, () -> new Student("228229", "Bale", "", "abale0@cdbaby.com", "161-231-3382"));
        assertThrows(IllegalArgumentException.class, () -> new Student("228229", "Bale", "Allianora", "", "161-231-3382"));
        assertThrows(IllegalArgumentException.class, () -> new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", ""));
    }

    /**
     * Test case for the compareTo method.
     */
    @Test
    public void testCompareTo() {
        Student student1 = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        Student student1Duplicate = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        Student student2 = new Student("228230", "Adams", "Jane", "jane.adams@example.com", "555-5556");

        assertTrue(student1.compareTo(student2) > 0);
        assertTrue(student2.compareTo(student1) < 0);
        assertEquals(0, student1.compareTo(student1Duplicate));
    }

    /**
     * Test case for the equal's method.
     */
    @Test
    public void testEquals() {
        Student student1 = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        Student student2 = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        Student student3 = new Student("228230", "Adams", "Jane", "jane.adams@example.com", "555-5556-2343");

        assertEquals(student1, student2);
        assertNotEquals(student1, student3);
        assertNotEquals(student2, student3);
    }

    /**
     * Test case for the hashCode method.
     */
    @Test
    public void testHashCode() {
        Student student1 = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        Student student2 = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");

        assertEquals(student1.hashCode(), student2.hashCode());
    }

    /**
     * Test case for the toString method.
     */
    @Test
    public void testToString() {
        Student student = new Student("228229", "Bale", "Allianora", "abale0@cdbaby.com", "161-231-3382");
        String expectedString = "Student{id='228229', lastName='Bale', firstName='Allianora', email='abale0@cdbaby.com', phone='161-231-3382'}";

        assertEquals(expectedString, student.toString());
    }

}
