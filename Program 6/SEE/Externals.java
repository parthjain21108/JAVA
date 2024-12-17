package SEE;
import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {
    protected int[] seeMarks;
    protected int[] finalMarks;
    int x = 5;

    public Externals(String usn, String name) {
        super(usn, name);
        this.seeMarks = new int[x];
        this.finalMarks = new int[x];
    }

    public void get_SEE_marks() {
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter Marks for SEE");
        for (int i = 0; i < x; i++) {
            seeMarks[i] = s3.nextInt();
        }
    }

    public void calc_final_marks() {
        for (int i = 0; i < x; i++) {
            finalMarks[i] = cieMarks[i] + seeMarks[i];
        }
    }

    public void display_final_marks() {
        display_details();
        System.out.println("Final Marks for each subject: ");
        for (int i = 0; i < x; i++) {
            System.out.println("Subject " + (i + 1) + ": " + finalMarks[i]);
        }
    }

    public static void main(String[] args) {
        Externals externals = new Externals("33", "Parth");
        externals.get_details();
        externals.get_CIE_marks();
        externals.get_SEE_marks();
        externals.calc_final_marks();
        externals.display_final_marks();
    }
}
