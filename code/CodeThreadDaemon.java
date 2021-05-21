package code;
// 当运行的线程都是守护线程时，虚拟机退出

// 模拟刘备死后，关羽和张飞也不活了的情景

public class CodeThreadDaemon {
    public static void main(String[] args) {
        // Thread.currentThread();
        MyThreadDaemon td1 = new MyThreadDaemon();
        MyThreadDaemon td2 = new MyThreadDaemon();
        td1.setName("关羽");
        td2.setName("张飞");
        td1.setDaemon(true);
        td2.setDaemon(true);
        Thread.currentThread().setName("刘备");
        td1.start();
        td2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

}

class MyThreadDaemon extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + ": " + i);

        }
    }
}