package practice;

import java.util.Scanner;

/**
 * DemoXarray1
 */
public class Demo5array1 {

    public static void main(String[] args) {
        int[] primes = new int[1227170];    // 1227161
        primes[0] = 2;
        int cnt = 1;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        MainLoop:
        for (int i = 3; i <= x; i++) {
            for (int j = 0; j < cnt && primes[j] * primes[j] < i; j++) {
                if (i % primes[j] == 0) {
                    continue MainLoop;
                }
            }
            primes[cnt++] = i;
            
        }
        // for (int i = 0; i < cnt; i++) {
        //     System.out.println(primes[i]);
        // }
        if (primes[cnt - 1] == x) {
            System.out.println(x + " is a prime");
        }
        System.out.println(cnt);
    }
}