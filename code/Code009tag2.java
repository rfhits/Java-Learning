package code;

// 辗转相除法求两数最大公约数

import java.util.Scanner;

public class Code009tag2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("greatest common divisor is " + a);
    }
}
