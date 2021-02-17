package code;

// 做一个换零钱的机器，换成1、5、10的面额。
// 要求只输出一种方法，即只输出一次

import java.util.Scanner;

public class Code009tag1 {
    public static void main(String[] args) {
        System.out.println("input the ammount u want to exchange for changes:");
        Scanner sc = new Scanner(System.in);
        int ammount = sc.nextInt();
        sc.close();
        OUT: for (int i = 0; i <= ammount; i++) {
            for (int j = 0; j <= ammount / 5; j++) {
                for (int k = 0; k <= ammount / 10; k++) {
                    if (i + j * 5 + k * 10 == ammount) {
                        System.out.println("1$: " + i);
                        System.out.println("5$: " + j);
                        System.out.println("10$: " + k);
                        break OUT;
                    }
                }
            }
        }
        System.out.println("changes got");
    }
}
