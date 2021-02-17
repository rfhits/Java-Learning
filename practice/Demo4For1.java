package practice;

// 输出水仙花数，即个位、十位和百位数的立方和等于原数的三位数

public class Demo4For1 {
    public static void main(String[] args) {
        int x;
        for (x = 100; x <= 999; x++) {
            int onePlace = x % 10;
            int tenPlace = (x % 100) / 10;
            int hundredPlace = x / 100;
            int sum = (int) 
                        (Math.pow(onePlace, 3) + Math.pow(tenPlace, 3) + Math.pow(hundredPlace, 3));
            if (sum == x) {
                System.out.println(x);
            }
        }
    }
}
