package Construct;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
        System.out.print("初始化完成");
    }
    public static void main(String [] agrs){
        Person p = new Person("john",23);
    }
}
