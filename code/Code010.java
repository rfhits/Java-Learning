package code;

import java.util.Scanner;

public class Code010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int z = sum(x, y);
        System.out.println(z);

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
