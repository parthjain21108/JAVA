import java.io.*;
import java.util.Scanner;

public class main {
    Scanner sc = new Scanner(System.in);
    String usn;
    String name;
    int[] credit;
    int[] marks;

    public main(int numsubjects) {
        credit = new int[numsubjects];
        marks = new int[numsubjects];
    }

    void accept() {
        System.out.println("Enter USN: ");
        usn = sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();

        for (int i = 0; i < credit.length; i++) {
            System.out.printf("Enter credit of subject %d: ", i + 1);
            credit[i] = sc.nextInt();
        }

        for (int j = 0; j < marks.length; j++) {
            System.out.printf("Enter marks of subject %d: ", j + 1);
            marks[j] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < credit.length; i++) {
            System.out.printf("Credit of subject %d = %d\n", i + 1, credit[i]);
        }

        for (int j = 0; j < marks.length; j++) {
            System.out.printf("Marks of subject %d = %d\n", j + 1, marks[j]);
        }
    }

    void calc() {
        int totalCredit = 0;
        int wmarks = 0;

        for (int i = 0; i < credit.length; i++) {
            int mmars = (marks[i] / 10) + 1;
            totalCredit = totalCredit + credit[i];
            wmarks = wmarks + mmars * credit[i];
        }

        if (totalCredit == 0) {
            System.out.println("GPA cannot be calculated, total credits are zero.");
            return;
        }

        double gpa = (double) wmarks / totalCredit;
        System.out.println("GPA = " + gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int numsubjects = sc.nextInt();

        main s1 = new main(numsubjects);
        sc.nextLine();

        s1.accept();
        s1.display();
        s1.calc();
    }
}
