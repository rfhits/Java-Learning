package code;

class Student1 {
    private String name = "Zhang San";
    private int age = 20;

    public Student1() {}

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class Code018 {
    public static void main(String[] args) {
        Student1 s = new Student1("Li Si", 30);
    }
}
