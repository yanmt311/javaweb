import java.util.concurrent.TimeUnit;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            Thread.sleep(1);        // 毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(2);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(3);
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(4);
    }
}
