package cn.kis2.constructor;

public class Student {
    String name;
    int age;
    char sex;

    // 无参数构造方法
    Student() {
        System.out.println("无参构造器");
    }

    // 有参数构造方法
    Student(String name) {
        System.out.println("有参构造器" + name);
    }

    Student(String n, int a, char s) {
        name = n;
        age = a;
        sex = s;
    }
}
