package practice;

// 输入一个分数，判断落在哪个区间

import java.util.Scanner;

public class Demo2If2 {
    public static void main(String[] args) {
        System.out.println("输入学生成绩");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();
        if (score > 100 || score < 0) {
            System.out.println("输入错误");
        } else if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 60) {
            System.out.println("一般");
        } else {
            System.out.println("不及格");
        }
    }
}
