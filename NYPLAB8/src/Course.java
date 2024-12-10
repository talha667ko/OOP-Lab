
public abstract class Course implements TakeCourse {
    public String courseName;
    public int courseClass;

    public Course(String name, int cl) {
        courseName = name;
        courseClass = cl;
    }

    public void capitalize(String a) {
        System.out.println("Capitalized course name: " + a.toUpperCase());
    }

    abstract public void getName(String name);

    abstract public void getClasss(int cls);

}

//