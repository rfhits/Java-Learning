package code;

public class Code019 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}

/**
 * InnerCode019
 */
class MyThread extends Thread {
    // private String name;

    public void run() {
        System.out.println("Thread" + this.getName() + " is running");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }

}
