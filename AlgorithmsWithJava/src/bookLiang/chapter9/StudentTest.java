package bookLiang.chapter9;

public class StudentTest {
    static int x = 10;
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isCSmajor? " + student.isCSmajor);
        System.out.println("gebder? " + student.gender);
        System.out.println(x);
    }
}
