import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person male = new Person("João");
        male.setAge (5);
        Person female = new Person("Maria");
        female.setAge(10);
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("female name: " + female.getName() + " age: " + female.getAge());
    }

}
