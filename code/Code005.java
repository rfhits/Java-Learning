package code;

public class Code005 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x / y);
        System.out.println(x * 1.0 / y);

        int a = 1;
        int b = 1;
        int c = a++;    // 先把a的值给c，a再自增
        int d = ++b;    // b先自增，再把自增后的b赋值给d
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }

}