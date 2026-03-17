import java.util.Scanner;

class Student{
    String name;
    int roll;
    double mark1;
    double mark2;
    double mark3;

    double percentage;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void inputMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 sujects out of 100; ");
        mark1 = sc.nextDouble();
        mark2 = sc.nextDouble();
        mark3 = sc.nextDouble();
    }

    void calculatePercentage(){
        percentage = (mark1 + mark2  + mark3)/3;
    }
    void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Percentage : " + percentage);        
    }

    double getPercentage(){
        return percentage; 
    }
}

public class Program1{
    public static void main(String[] args){
        Student s1 = new Student("Priyanshu",142);
        Student s2 = new Student("Himanshu", 88);
        s1.inputMarks();    
        s2.inputMarks();
        s1.calculatePercentage();
        s2.calculatePercentage();
        s1.displayStudent();
        s2.displayStudent();

        if(s1.getPercentage() > s2.getPercentage())
            System.out.println(s1.name + " has more marks");
        else 
            System.out.println(s2.name + " has more marks");
    }
}