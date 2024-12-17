import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "Age should be greater than zero";
    }
}

class MyExcep extends Exception {
    public String toString() {
        return "Father's age should be greater than son's age";
    }
}

class Father {
    int fage;

    Father(int fage) {
        this.fage = fage;
    }

    void wrongAge(int a) throws MyException {
        if (a < 0) {
            throw new MyException();
        } else {
            System.out.println("Valid age: " + a);
        }
    }
}

class Son extends Father {
    int sage;

    Son(int fage, int sage) {
        super(fage);
        this.sage = sage;
    }

    void checkAge() throws MyExcep {
        if (sage > fage) {
            throw new MyExcep();
        } else {
            System.out.println("Valid son's age: " + sage);
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int age1, age2;

        System.out.print("Enter father's age: ");
        age1 = s.nextInt();
        
        Father f = new Father(age1);
        try {
            f.wrongAge(age1);
        } catch (MyException e) {
            System.out.println("Caught: " + e);
        }

        System.out.print("Enter son's age: ");
        age2 = s.nextInt();

        Son s1 = new Son(age1, age2);
        try {
            s1.checkAge();
        } catch (MyExcep e) {
            System.out.println("Caught: " + e);
        }
    }
}
