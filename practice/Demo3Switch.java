package practice;

// 键盘录入月份，输出季度

import java.util.Scanner;

public class Demo3Switch {
    public static void main(String[] args) {
        System.out.println("以整数形式输入一个月份：");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("第一季度");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("第二季度");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("第三季度");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("第四季度");
                break;

            default:
                System.out.println("输入格式错误");
                break;
        }
    }
}
