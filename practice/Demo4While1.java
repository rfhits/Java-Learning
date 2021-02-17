package practice;

// 一张厚度为0.01米的，经过多少次折叠，高度会超过珠穆朗玛峰？

public class Demo4While1 {
    public static void main(String[] args) {
        double h = 0.01;
        int mountHeight = 8848;
        int cnt = 0;
        while (h <= mountHeight) {
            h *= 2;
            cnt++;
        }
        System.out.println("经过" + cnt + "次折叠，" + "纸的高度为" + h + "米，超过了珠穆朗玛峰。");
    }
}
