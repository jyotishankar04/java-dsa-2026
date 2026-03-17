class Student{
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    Student(Student student) {
        this(student.name, student.roll);
    }    
}
public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("S", 1);
        Student s2 = new Student(s1);
        s2.name = "R";
        System.out.println(s2.name);
        System.out.println(s1.name);

     }
}
