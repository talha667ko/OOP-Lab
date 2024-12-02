
import java.util.ArrayList;

public class ClassesAndMethods {

    public static void main(String[] args) {

        ArrayList<Course> courses = new ArrayList<Course>();
        Course course1 = new Course();
        Course course2 = new Course("Math");
        Course course3 = new Course("French", 303, "Mr.Barbero");
        Student student1 = new Student();
        Student student2 = new Student("Talha", 1);
        Student student3 = new Student("Alpo", 2, course3);
        Student student4 = new Student("Dilara", 2);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        student1.courseList.add(course3);
        student1.courseList.add(course1);
        student2.courseList.add(course2);
        student3.courseList.add(course1);
        student3.courseList.add(course2);

        student1.studentInfo();
        student1.studentsCInfo();
        student2.studentInfo();
        student2.studentsCInfo();
        student3.studentInfo();
        student3.studentsCInfo();
        student4.studentInfo();
        student4.studentsCInfo();

        System.out.println("\nCourse Info:");
        course1.courseNInfo();
        for (Course course : courses) {
            course.courseInfo();
        }
    }
}

class Student {

    String name;
    int classN;
    ArrayList<Course> courseList = new ArrayList<Course>();
    static int studentN;

    Student() {
        this.name = "Franck";
        this.classN = 1;
        studentN++;
    }

    Student(String name, int a) {
        this.name = name;
        this.classN = a;
        studentN++;
    }

    Student(String name, int a, Course courselist) {
        this.name = name;
        this.classN = a;
        this.courseList.add(courselist);
        studentN++;
    }

    public void studentInfo() {
        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("Class: " + classN);
    }

    public void studentsCInfo() {
        if (courseList.size() == 0) {
            System.out.println("This student doesn't take any course.");
        } else {
            for (int i = 0; i < courseList.size(); i++) {
                System.out.println("Course: " + courseList.get(i).name + " / class: " + courseList.get(i).classN
                        + " / professor: " + courseList.get(i).professor);
            }
            System.out.println("Student is taking: " + courseList.size() + " courses.");
        }
    }
}

class Course {

    String name;
    int classN;
    String professor;
    static int courseN;

    Course() {
        this.name = "Programming";
        this.classN = 301;
        this.professor = "Mr. Suhap";
        courseN++;
    }

    Course(String name) {
        this.name = name;
        this.classN = 302;
        this.professor = "Mr. HaudeCoeur";
        courseN++;
    }

    Course(String name, int classN, String prof) {
        this.name = name;
        this.classN = classN;
        this.professor = prof;
        courseN++;
    }

    public void courseInfo() {
        System.out.println("------------------");
        System.out.println("Course name: " + name);
        System.out.println("in Class: " + classN);
        System.out.println("The teacher: " + professor);
    }

    public void courseNInfo() {
        System.out.println("The number of course: " + courseN);
    }
}
