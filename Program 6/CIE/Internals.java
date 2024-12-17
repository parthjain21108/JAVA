package CIE;
import java.util.Scanner;

public class Internals extends Student {
    protected int[] cieMarks;
    int n = 5;

    public Internals(String usn, String name) {
        super();
        this.usn = usn;
        this.name = name;
        this.cieMarks = new int[n];
    }

    public void get_CIE_marks() {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter Marks for CIE");
        for (int i = 0; i < n; i++) {
            cieMarks[i] = s2.nextInt();
        }
    }

    public void display_CIE_marks() {
        System.out.println("CIE Marks for the student " + name + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": " + cieMarks[i]);
        }
    }
}
