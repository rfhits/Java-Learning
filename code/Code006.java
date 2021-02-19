package code;

import java.util.Scanner;

public class Code006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("read an integer");
        int x = sc.nextInt();
        System.out.println(x);

        // 输入一个整数，按下回车后，回车也会被读到line里面
        System.out.println("read a line");
        String line = sc.nextLine();
        System.out.println(line);

        System.out.println("read a word");
        String word = sc.next();
        System.out.println(word);

        sc.close();

    }
}
