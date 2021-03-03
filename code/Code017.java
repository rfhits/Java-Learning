package code;

class Student {

    int age;

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            System.out.println("the age you input is not reasonable");
        } else {
            this.age = age;
        }
    }
}


public class Code017 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(0);
    }

}
