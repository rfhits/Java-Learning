package code;

// 数组的初始化

public class Code012 {
    public static void main(String[] args) {
        // 动态初始化
        int[] arr1 = new int[3];
        System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 静态初始化
        int[] arr2 = { 2, 3, 4 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
