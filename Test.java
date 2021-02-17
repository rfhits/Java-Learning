// 验证default和break，以及switch的匹配模式

class Test {
    public static void main(String[] args) {
        int x = 4;
        switch (x) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                // break;

            default:
                System.out.println("default here");
                // break;

            case 4:
                System.out.println(4);
                break;
        }
    }
}