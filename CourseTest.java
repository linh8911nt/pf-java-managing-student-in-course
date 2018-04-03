

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("javer");
        displayCourse(course);

        String andy = "andy";
        course.addStudent(andy);
        displayCourse(course);

        String booby = "booby";
        course.addStudent(booby);
        displayCourse(course);

        course.removeStudent(andy);
        displayCourse(course);

        String samy = "samy";
        course.addStudent(samy);
        displayCourse(course);
    }

    public static void displayCourse(Course course){
        System.out.println("Course \"" + course.getName()
                + "\" has " + course.getStudentCount()
                + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentCount(); i++){
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }
}
