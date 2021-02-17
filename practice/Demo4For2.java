package practice;

// 输出九九乘法表
/*
    1 * 1 = 1
    1 * 2 = 2   2 * 2 = 4
    1 * 3 = 3   2 * 3 = 6   3 * 3 =9
*/

public class Demo4For2 {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(x + " * " + y + " = " + x * y + "    ");
            }
            System.out.println();
        }
    }
}
