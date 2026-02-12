import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String course;

    private transient String password;

    public Student(int id, String name, String course, String password) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.password = password;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Password : " + password);
    }
}
