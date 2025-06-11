import java.util.Vector;

class Student
{
    String name;
    int age;
    public Student(String name, int age)
    {
        this.name = name;
        this.age= age;
    }

    void display()
    {
        System.out.println("dislay student details:" );
        System.out.println(name);
        System.out.println(age);
    }
}
public class VectorEx3 {
    public static void main(String[] args) {
        // Student p = new Student("HArika", 23);
        // p.display();
        Vector<Student> s = new Vector<>();
        s.add(new Student("HArika", 22));
        for(Student student: s)
        {
            student.display();
        }
    }
}
