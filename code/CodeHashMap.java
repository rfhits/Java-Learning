package code;

import java.util.HashMap;
import java.util.Scanner;

public class CodeHashMap {
    public static void main(String[] args) {
        // 创建HashMap对象
        HashMap<Integer, String> coinNames = new HashMap<>();

        // 为HashMap对象添加元素
        coinNames.put(1, "penny");
        coinNames.put(5, "nickel");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dollar");

        // 直接输出HashMap
        System.out.println(coinNames);

        
        // 通过get(key)访问元素
        System.out.println(coinNames.get(10));
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        // containsKey(Key)判断是否含此key
        if (coinNames.containsKey(amount)) {
            System.out.println(coinNames.get(amount));
        } else {
            System.out.println("Not Found");
        }
        sc.close();

        // 通过keySet来遍历HashMap
        for (Integer i : coinNames.keySet()) {
            System.out.println(coinNames.get(i));
        }
    }
}
