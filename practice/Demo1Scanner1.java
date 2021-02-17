package practice;

// 使用键盘录入三个整数，再输出最大值。

import java.util.Scanner;

public class Demo1Scanner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        x = (x > y) ? x : y;
        z = (z > x) ? z : x;
        System.out.println(z);
        sc.close();

    }
}