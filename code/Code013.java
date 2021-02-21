package code;

public class Code013 {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][];
        System.out.println("info of arr1");
        System.out.println("arr1: " + arr1);
        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr1[1]: " + arr1[1]);
        System.out.println(arr1[0][0]);
        
        System.out.println("----");
        System.out.println("info of arr2");
        System.out.println("arr1: " + arr2);
        System.out.println("arr1[0]: " + arr2[0]);
        System.out.println("arr1[1]: " + arr2[1]);
        System.out.println("----");

        int[][] arr3 = { { 0, 1, 2 }, { 3, 4, 5 } };
        System.out.println("遍历arr3");
        for (int x = 0; x < arr3.length; x++) {
            for (int y = 0; y < arr3[x].length; y++) {
                System.out.print(arr3[x][y] + " ");
            }
            System.out.println();
        }

    }
}
