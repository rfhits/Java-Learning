package code; // package语句放在第一行

/*
    常量赋值给变量时，先检查自身的范围在不在这个变量的范围之内，若在则不报错，否则报错。
    这一步在编译的阶段就会报错。

    若是变量运算再赋值，byte/short/char默认转换成int，而int赋值给byte/char/short也会报错
 */

public class Code004 {
    public static void main(String[] args) {
        // byte x = (byte) 130;
        // System.out.println(x);
        // out of range
        // byte y = 130;
        // System.out.println(y);

        // cant convert int to byte
        // byte a = 1;
        // byte b = 2;
        // byte c = a + b;

        int a = 1;
        int b = 2147483647;
        int c = a + b;
        System.out.println(c);
    }
}
