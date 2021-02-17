package practice;

// 输入一个数，判断奇偶

import java.util.Scanner;

public class Demo2If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
