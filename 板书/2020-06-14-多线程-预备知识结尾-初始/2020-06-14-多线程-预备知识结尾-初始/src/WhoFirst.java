public class WhoFirst {
    static class PrintA extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("A");
            }
        }
    }

    static class PrintB extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) {
        PrintA a = new PrintA();
        PrintB b = new PrintB();
        a.start();
        b.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main");
        }
    }
}
