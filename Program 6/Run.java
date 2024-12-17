import SEE.Externals;
import java.util.Scanner;

class Run {
    public static void main(String args[]) {
        int num;
        Scanner s4 = new Scanner(System.in);
        System.out.println("Enter no of students");
        num = s4.nextInt();
        Externals[] e = new Externals[num];

        for (int i = 0; i < num; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter USN NAME SEM for student " + (i + 1));
            String usn = input.nextLine();
            String name = input.nextLine();
            int sem = input.nextInt();

            e[i] = new Externals(usn, name);
            e[i].input();
            e[i].disp();
            e[i].inpciemarks();
            e[i].inpseemarks();
            e[i].calc_final_marks();
            e[i].display_final_marks();
        }
    }
}
