import java.util.Objects;
/**
 * Represents a student with a unique identifier, last name, first name, email, and phone.
 * <p>
 * This record class ensures that all the attributes of a student are non-null and non-empty.
 * It implements the {@code Comparable} interface to facilitate ordering based on the last name of the student.
 * </p>
 *
 * @param id        the unique identifier for the student. Must be non-null and non-empty.
 * @param lastName  the student's last name. Must be non-null and non-empty.
 * @param firstName the student's first name. Must be non-null and non-empty.
 * @param email     the student's email address. Must be non-null and non-empty.
 * @param phone     the student's phone number. Must be non-null and non-empty.
 */
public record Student(String id, String lastName, String firstName, String email, String phone)
        implements Comparable<Student> {

    /**
     * Constructs a new student with the specified attributes.
     *
     * @param id        the unique identifier for the student. Must be non-null and non-empty.
     * @param lastName  the student's last name. Must be non-null and non-empty.
     * @param firstName the student's first name. Must be non-null and non-empty.
     * @param email     the student's email address. Must be non-null and non-empty.
     * @param phone     the student's phone number. Must be non-null and non-empty.
     *
     * @throws IllegalArgumentException if any parameter is null or empty.
     */
    public Student {
        if (id == null || id.isBlank() ||
                lastName == null || lastName.isBlank() ||
                firstName == null || firstName.isBlank() ||
                email == null || email.isBlank() ||
                phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Parameters must not be null or empty");
        }
    }

    /**
     * Compares this student to another based on the last name.
     *
     * @param other the student to compare to.
     * @return a negative integer, zero, or a positive integer if this student's last name
     *         is less than, equal to, or greater than the other student's last name, respectively.
     */
    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }

    /**
     * Indicates whether some other object is "equal to" this one by comparing all attributes.
     *
     * @param obj the object to compare to.
     * @return {@code true} if the object is a student and has the same attributes as this student;
     *         {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other;
        other = (Student) obj;
        return this.id.equals(other.id) &&
                this.lastName.equals(other.lastName) &&
                this.firstName.equals(other.firstName) &&
                this.email.equals(other.email) &&
                this.phone.equals(other.phone);
    }

    /**
     * Returns a hash code value for the student based on all its attributes.
     *
     * @return a hash code value for this student.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, email, phone);
    }

    /**
     * Returns a string representation of the student in the form:
     * "Student{id='ID', lastName='LASTNAME', firstName='FIRSTNAME', email='EMAIL', phone='PHONE'}".
     *
     * @return a string representation of the student.
     */
    @Override
    public String toString() {
        return String.format("Student{id='%s', lastName='%s', firstName='%s', email='%s', phone='%s'}",
                id, lastName, firstName, email, phone);
    }
}
