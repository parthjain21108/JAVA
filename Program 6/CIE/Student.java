package CIE;
import java.util.Scanner;

public class Student {
    protected String usn, name;
    protected int sem;

    public Student() {
        this.usn = "";
        this.name = "";
        this.sem = 0;
    }

    public void get_details() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter USN NAME SEM");
        usn = s1.nextLine();
        name = s1.nextLine();
        sem = s1.nextInt();
    }

    public void display_details() {
        System.out.println("Student Details");
        System.out.println("USN - " + usn);
        System.out.println("NAME - " + name);
        System.out.println("Sem - " + sem);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.get_details();
        student.display_details();
    }
}
