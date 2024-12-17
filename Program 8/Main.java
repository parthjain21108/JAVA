class BMSCE extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            try {
                System.out.println("BMSCE ");
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class CSE extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("CSE ");
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Main {
    public static void main(String args[]) {
        BMSCE b1 = new BMSCE();
        b1.start();
        CSE c1 = new CSE();
        c1.start();
    }
}
